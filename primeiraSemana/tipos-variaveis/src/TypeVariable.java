public class TypeVariable {
    public static void main(String[] args) {

        // Structure: <VariableType> <variableName> = <Attribution (optional)>

        int birthYear = 2005;
        String year;
        String cpf = "490.897.698-89";
        double minimumSalary = 1453.32;
        float pi = 3.14F;

        // Java is strongly typed

        short smallNumber = 1;
        int mediumNumber = smallNumber;
        short greatNumber = (short) mediumNumber;

        // Normal variable
        int number = 1;
        number = 2;

        // Constant variable: <Final> <VariableType> <variableName> = <Attribution (optional)>
        final int YEARS_OLD = 19;
        final String NAME = "Luiz";

        System.out.println(NAME);
        System.out.println(YEARS_OLD);

        // small double int long float String boolean char
    }
}

