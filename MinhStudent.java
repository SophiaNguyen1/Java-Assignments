public class MinhStudent {
  private float gpa;
  private String name;
  
  public MinhStudent (float gpa, String name) {
    this.gpa = gpa;
    this.name = name;
  }
  
}

class GradStudent extends Student {
  private String major;
  
  public GradStudent(String major, float gpa, String name) {
    super(gpa, name);
  }
}