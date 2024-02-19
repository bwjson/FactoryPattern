public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("cpp");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if(specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if(specialty.equalsIgnoreCase("cpp")) {
            return new CppDeveloperFactory();
        } else if(specialty.equalsIgnoreCase("python")) {
            return new PythonDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + "unknown specialty");
        }
    }
}