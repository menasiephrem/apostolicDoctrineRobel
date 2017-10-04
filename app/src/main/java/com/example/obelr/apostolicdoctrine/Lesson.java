package com.example.obelr.apostolicdoctrine;

/**
 * Created by Menasi on 9/12/2017.
 */

public class Lesson {

    private String LESSON_ID;
    private String LESSON_MODULE;
    private String LESSON_TITLE;
    private String LESSON_STRING;

    public Lesson(String LESSON_ID, String LESSON_MODULE, String LESSON_TITLE, String LESSON_STRING, String _PR_LESSON, String _NXT_LESSON,
                  String LESSON_STARTING_QUESTION, String LESSON_CURRENT_QUESTION) {
        this.LESSON_ID = LESSON_ID;
        this.LESSON_MODULE = LESSON_MODULE;
        this.LESSON_TITLE = LESSON_TITLE;
        this.LESSON_STRING = LESSON_STRING;
        this._PR_LESSON = _PR_LESSON;
        this._NXT_LESSON = _NXT_LESSON;
        this.LESSON_STARTING_QUESTION = LESSON_STARTING_QUESTION;
        this.LESSON_CURRENT_QUESTION = LESSON_CURRENT_QUESTION;
    }

    private String _PR_LESSON;
    private String _NXT_LESSON;
    private String LESSON_STARTING_QUESTION;
    private String LESSON_CURRENT_QUESTION;

    public Lesson(String LESSON_ID,String LESSON_MODULE , String LESSON_TITLE, String LESSON_STRING, String _PR_LESSON,
                  String _NXT_LESSON, String LESSON_STARTING_QUESTION) {
        this.LESSON_ID = LESSON_ID;
        this.LESSON_TITLE = LESSON_TITLE;
        this.LESSON_MODULE = LESSON_MODULE;
        this.LESSON_STRING = LESSON_STRING;
        this._PR_LESSON = _PR_LESSON;
        this._NXT_LESSON = _NXT_LESSON;
        this.LESSON_STARTING_QUESTION = LESSON_STARTING_QUESTION;
        this.LESSON_CURRENT_QUESTION =LESSON_STARTING_QUESTION;
    }


    public String getLESSON_ID() {
        return LESSON_ID;
    }

    public String getLESSON_MODULE() {
        return LESSON_MODULE;
    }

    public String getLESSON_TITLE() {
        return LESSON_TITLE;
    }

    public String getLESSON_STRING() {
        return LESSON_STRING;
    }

    public String get_PR_LESSON() {
        return _PR_LESSON;
    }

    public String get_NXT_LESSON() {
        return _NXT_LESSON;
    }

    public String getLESSON_STARTING_QUESTION() {
        return LESSON_STARTING_QUESTION;
    }

    public String getLESSON_CURRENT_QUESTION() {
        return LESSON_CURRENT_QUESTION;
    }

    public static Lesson [] lessons = {
            new Lesson("Mod1Less1", "Mod1", "Mod1Less1TitleWhoISGOD" , "Mod1Less1String" , "null" , "Mod1Less2" , "null"),
            new Lesson("Mod1Less2", "Mod1", "Mod1Less2TitleGODidSprirt" , "Mod1Less2String" , "Mod1Less1" , "Mod1Less3" , "null"),
            new Lesson("Mod1Less3", "Mod1", "Mod1Less3TitleGODIsWord" , "Mod1Less3String" , "Mod1Less2" , "Mod1Less4" , "null"),
            new Lesson("Mod1Less4", "Mod1", "Mod1Less4TitleGODRightHand" , "Mod1Less4String" , "Mod1Less3" , "null" , "null"),
            new Lesson("Mod2Less1", "Mod2", "Mod2Less1TitlewhatIsBible" , "Mod2Less1String" , "null" , "Mod2Less2" , "null"),
            new Lesson("Mod2Less2", "Mod2", "Mod2Less2TitleOtandNt" , "Mod2Less2String" , "Mod2Less1" , "null" , "null")


    };
}
