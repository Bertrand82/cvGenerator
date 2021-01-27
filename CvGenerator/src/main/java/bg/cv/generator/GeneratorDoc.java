package bg.cv.generator;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xwpf.usermodel.ParagraphAlignment;
import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.apache.poi.xwpf.usermodel.XWPFParagraph;
import org.apache.poi.xwpf.usermodel.XWPFRun;

import bg.cv.model.Cv;
import bg.cv.model.Cv.EtatCivil;
import bg.cv.model.Cv.Experiences.Experience;
import bg.cv.model.Cv.Formations.Formation;
import bg.cv.model.Cv.Skills.Skill;

public class GeneratorDoc {
	private final Cv cv;
	private final XWPFDocument document = new XWPFDocument();

	private List<XWPFParagraph> listParagraphs = new ArrayList<XWPFParagraph>();

	public GeneratorDoc(Cv cv) throws Exception {
		this.cv = cv;
		generate();
	}

	private void generate() throws Exception {
		generateEtatCivil();
		generateFormations();
		generateSkills();
		generateExperiences();
		print();
	}

	private void generateEtatCivil() {
		EtatCivil cvEtatCivil = this.cv.getEtatCivil();

		XWPFParagraph para = document.createParagraph();
		para.setAlignment(ParagraphAlignment.LEFT);

		XWPFRun para2Run = para.createRun();
		addLigne(para2Run,cvEtatCivil.getPrenom()+" "+ cvEtatCivil.getNom());		
		para2Run.addBreak();
		addLigne(para2Run, cvEtatCivil.getAdresse().getLigne1());
		addLigne(para2Run, cvEtatCivil.getAdresse().getLigne2());
		addLigne(para2Run, cvEtatCivil.getAdresse().getZipCode() + "  " + cvEtatCivil.getAdresse().getCity());
		addLigne(para2Run,cvEtatCivil.getEmail());
		addLigne(para2Run,cvEtatCivil.getTelephone());
		para2Run.setItalic(false);
		listParagraphs.add(para);
	}

	private void generateFormations() {
		XWPFParagraph para = document.createParagraph();
		
		XWPFRun run = para.createRun();
		para.setAlignment(ParagraphAlignment.CENTER);
		addLigne(run, "Formation");
		
		para.setAlignment(ParagraphAlignment.LEFT);
		Cv.Formations formations = this.cv.getFormations();
		for (Formation formation : formations.getFormation()) {
			addLigne(run, formation.getDiplome(), formation.getSchool(), formation.getYear());
		}
		listParagraphs.add(para);
	}
	private void generateSkills() {
		XWPFParagraph para = document.createParagraph();
		para.setAlignment(ParagraphAlignment.LEFT);
		XWPFRun run = para.createRun();
		addLigne(run, "Compétences");
		Cv.Skills skills = this.cv.getSkills();
		for (Skill skill : skills.getSkill()) {
			addLigne(run, skill.getLabel(), skill.getNivel());
		}
		listParagraphs.add(para);
	}
	private void generateExperiences() {
		Cv.Experiences experiences = this.cv.getExperiences();
		for (Experience experience : experiences.getExperience()) {
			generateExperience(experience);
		}
	}
	private void generateExperience(Experience experience) {
		XWPFParagraph para = document.createParagraph();
		para.setAlignment(ParagraphAlignment.LEFT);
		XWPFRun run = para.createRun();
		addLigne(run, "   ");
		String s = ""+experience.getDateStart()+" au "+experience.getDateEnd()+"  "+experience.getEntreprise().getNom();
		addLigne(run, s);
		addLigne(run, experience.getExperienceTitre());
		for(String task : experience.getTasks().getTask()) {
			addLigne(run, task);
		}
	
	}

	private static void addLigne(XWPFRun run, Object text1, Object text2, Object text3) {
		if (text1 == null) {
		} else if (text2 == null) {
		} else {
			addLigne(run, text1 + " " + text2 + "  " + text3);
		}
	}

	private static void addLigne(XWPFRun run, Object text1, Object text2) {
		if (text1 == null) {
		} else if (text2 == null) {
		} else {
			addLigne(run, text1 + " " + text2);
		}

	}

	private static void addLigne(XWPFRun run, Object text) {
		if (!isNullOrEmpty(text)) {
			run.setText("" + text);
			run.addBreak();
		}
	}

	private static boolean isNullOrEmpty(Object text) {
		if (text == null) {
			return true;
		}
		if ((""+text).length()==0) {
			return true;
		}
		if ((""+text).endsWith("null]")) {
			return true;
		}
		return false;
	}

	private static File DIR = new File("out");

	private void print() throws Exception {
		DIR.mkdirs();
		File file = new File(DIR, "cv_" + System.currentTimeMillis() + ".doc");
		FileOutputStream fout = new FileOutputStream(file);
		document.write(fout);
		document.close();
		fout.close();
	}
}
