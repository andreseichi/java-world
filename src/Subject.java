public class Subject {
  String name;
  private int credits;
  private int hours;

  public void printSubjectInfo() {
    System.out.println("Name: " + name);
    System.out.println("Credits: " + credits);
    System.out.println("Hours: " + hours);
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }

  public int getHours() {
    return hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }
}
