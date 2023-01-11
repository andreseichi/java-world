public class User {
  int age;
  private String name;
  private String email;
  Subject subject;

  public void printUserInfo() {
    System.out.println("Name: " + name);
    System.out.println("Email: " + email);
    System.out.println("Age: " + age + " years old");
    System.out.println("Subject:");
    subject.printSubjectInfo();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setSubject(Subject subject) {
    this.subject = subject;
  }
}
