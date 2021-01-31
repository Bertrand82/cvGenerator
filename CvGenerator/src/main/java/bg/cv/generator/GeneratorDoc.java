package bg.cv.generator;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import bg.cv.model.Cv;
import bg.cv.model.Cv.EtatCivil;
import bg.cv.model.Cv.Experiences.Experience;

import bg.cv.model.Cv.Skills;
import bg.cv.model.Cv.Skills.Skill;

public class GeneratorDoc {
	private final Cv cv;
	public static File DIR = new File("out");

	private List<IWritter> listWritters = new ArrayList<IWritter>();

	public GeneratorDoc(Cv cv) throws Exception {
		this.cv = cv;
		this.listWritters.add(new WritterWord());
		this.listWritters.add(new WritterText());
		this.listWritters.add(new WritterPdf());
		generate();
		listWritters.add(new WritterWord());
	}

	private void generate() throws Exception {
		generateEtatCivil();
		addTitle1(this.cv.getTitle());
		generateFormations();
		generateSkills();
		generateExperiences();
		print();
	}

	private void generateEtatCivil() {
		EtatCivil cvEtatCivil = this.cv.getEtatCivil();

		this.debutParagraphe();

		addLigne(cvEtatCivil.getFirstName() + " " + cvEtatCivil.getName());
		
		addBreak();
		addLigne(cvEtatCivil.getAddress().getLigne1());
		addLigne(cvEtatCivil.getAddress().getLigne2());

		addLigne(cvEtatCivil.getAddress().getZipCode() + "  " + cvEtatCivil.getAddress().getCity());
		addBreak();
		addLigne(cvEtatCivil.getEmail());
		addLigne(cvEtatCivil.getTelephon());

		finParagraphe();
	}

	private void generateFormations() {
		debutParagraphe();

		addTitle2("Formation");

		Cv.Educations education = this.cv.getEducations();
		education.getEducation().forEach((edu) ->addLigne(edu.getDiploma(), edu.getSchool(), edu.getYear())); 
		
		addBreak();
		finParagraphe();
	}

	private void generateSkills() {
		debutParagraphe();

		addTitle2("Compétences");
		List<Skills> listSkills = this.cv.getSkills();
		for (Skills skills : listSkills) {
			String s = skills.getSkillLabel() + " : ";
			for (Skill skill : skills.getSkill()) {
				s+= skill.getValue().trim()+", ";
			}
			s = s.substring(0, s.length()-2)+".";
			addLigne(s);
		}
		addBreak();
		finParagraphe();
	}

	private void generateExperiences() {

		addTitle2("Experiences et principales réalisation");
		Cv.Experiences experiences = this.cv.getExperiences();
		for (Experience experience : experiences.getExperience()) {
			generateExperience(experience);
		}
	}

	private void generateExperience(Experience experience) {
		debutParagraphe();
		addLigne("   ");
		String s = "" + experience.getDateStart() + " au " + experience.getDateEnd() + "  "
				+ experience.getCompany().getCompanyName() + "  : " + experience.getExperienceTitle();
		addTitle2(s);
		addLigneAndTrim(experience.getContext());
		addLigne(experience.getMyGoal());
		if (experience.getTasks().getTask().size() == 1) {
			addLigne(experience.getTasks().getTask().get(0));
		} else if (experience.getTasks().getTask().size() >= 2) {
			List<String> list = new ArrayList<String>();
			for (String task : experience.getTasks().getTask()) {
				list.add(task.trim());
			}
			addLignePuce(list);
		}
		if (!isNullOrEmpty(experience.getTechnos())){
			addLigne("Technologies : " + experience.getTechnos());
		}
		finParagraphe();

	}

	private void addLigne(Object text1, Object text2, Object text3) {
		if (text1 == null) {
		} else if (text2 == null) {
		} else {
			addLigne(text1 + " " + text2 + "  " + text3);
		}
	}

	

	private static boolean isNullOrEmpty(Object text) {
		if (text == null) {
			return true;
		}
		if (("" + text).length() == 0) {
			return true;
		}
		if (("" + text).endsWith("null]")) {
			return true;
		}
		return false;
	}

	private static boolean isListNullOrEmpty(List<?> list) {
		if (list == null) {
			return true;
		}
		if (list.size() == 0) {
			return true;
		}

		return false;
	}

	private void addBreak() {
		for (IWritter w : listWritters) {
			w.addBreak();
		}
	}

	private void debutParagraphe() {
		for (IWritter w : listWritters) {
			w.debutParagraphe();
		}
	}

	private void finParagraphe() {
		for (IWritter w : listWritters) {
			w.finPAragraphe();
		}
	}

	private void print() {
		for (IWritter w : listWritters) {
			w.print();
		}

	}

	private void addLigne(Object text) {
		if (!isNullOrEmpty(text)) {
			for (IWritter w : listWritters) {
				w.addLigne(text);
			}
		}
	}

	private void addLigneAndTrim(String text) {
		if (text != null) {
			addLigne(text.trim());
		}
	}

	private void addTitle1(String text) {
		if (!isNullOrEmpty(text)) {
			for (IWritter w : listWritters) {
				w.addTitle1(text);
			}
		}
	}

	private void addTitle2(String s) {
		if (!isNullOrEmpty(s)) {
			for (IWritter w : listWritters) {
				w.addTitle2(s);
			}
		}
	}

	private void addLignePuce(List<String> list) {
		if (!isListNullOrEmpty(list)) {
			for (IWritter w : listWritters) {
				w.addLignePuce(list);
			}
		}
	}
}
