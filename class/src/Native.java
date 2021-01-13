public class Native {
    private String studentID;
    private String firstName;
    private String surname;
    private int databaseGrade;
    private int designThinkingGrade;
    private int javaGrade;

    public Native() {
    }

    public Native(String studentID, String firstName, String surname) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.surname = surname;
    }

    public Native(String studentID, String firstName, String surname, int[] grades) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.surname = surname;
        
        javaGrade = grades[0];
        databaseGrade = grades[0];
        designThinkingGrade = grades[0];
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDatabaseGrade() {
        return databaseGrade;
    }

    public void setDatabaseGrade(int databaseGrade) {
        this.databaseGrade = databaseGrade;
    }

    public int getDesignThinkingGrade() {
        return designThinkingGrade;
    }

    public void setDesignThinkingGrade(int designThinkingGrade) {
        this.designThinkingGrade = designThinkingGrade;
    }

    public int getJavaGrade() {
        return javaGrade;
    }

    public void setJavaGrade(int javaGrade) {
        this.javaGrade = javaGrade;
    }
}
