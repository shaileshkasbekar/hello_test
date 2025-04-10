 class StudentManagementSystem {
    String fullName;
    String admissionYear;
    String registrationId;
    String department;
    String category;
    static int regCounter = 1;
    static int dsyCounter = 501;

    StudentManagementSystem(String admissionYear, String department, String category, String fullName) {
        this.fullName = fullName;
        this.admissionYear = admissionYear;
        this.department = department;
        this.category = category;

        this.createRegistrationId();
    }

    private String getDeptCode(String department) {
        String deptCode = "";
        if (department.equalsIgnoreCase("Information Technology") || department.equalsIgnoreCase("IT")) {
            deptCode = "IT";
        } else if (department.equalsIgnoreCase("Computer Science") || department.equalsIgnoreCase("CS")) {
            deptCode = "CS";
        } else if (department.equalsIgnoreCase("Electrical") || department.equalsIgnoreCase("EL")) {
            deptCode = "EL";
        }
        return deptCode;
    }

    private void createRegistrationId() {
        String deptCode = getDeptCode(department);
        if (category.equalsIgnoreCase("regular")) {
            this.registrationId = admissionYear + "B" + deptCode + regCounter;
            regCounter++;
        } else if (category.equalsIgnoreCase("DSY")) {
            this.registrationId = admissionYear + "B" + deptCode + dsyCounter;
            dsyCounter++;
        }
    }

    public void showDetails() {
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Department: " + this.department);
        System.out.println("Category: " + this.category);
        System.out.println("Registration ID: " + this.registrationId);
    }

    public static void main(String[] args) {
        if (args.length < 4) {
            System.out.println("Please enter: Name Year Branch Type");
            return;
        }

        String studentName = args[0];
        String yearOfAdmission = args[1];
        String dept = args[2];
        String studentCategory = args[3];

        StudentManagementSystem learner1 = new StudentManagementSystem(yearOfAdmission, dept, studentCategory, studentName);
        learner1.showDetails();
    }
}

