public class C1_11_PopulationProjection {
    public static void main(String[] args) {
        int CurrentPopulation = 312032486;
        int BirthRate = 7;
        int DeathRate = 13;
        int ImmigrantRate = 45;

        int SecondsInYear = 365 * 24 * 60 * 60;

        int BirthsPerYear = SecondsInYear / BirthRate;
        int DeathsPerYear = SecondsInYear / DeathRate;
        int ImmigrantsPerYear = SecondsInYear / ImmigrantRate;

        int AnnualNewPopulation = BirthsPerYear + ImmigrantsPerYear - DeathsPerYear;

        int PopulationYear1 = CurrentPopulation + AnnualNewPopulation;
        int PopulationYear2 = PopulationYear1 + AnnualNewPopulation;
        int PopulationYear3 = PopulationYear2 + AnnualNewPopulation;
        int PopulationYear4 = PopulationYear3 + AnnualNewPopulation;
        int PopulationYear5 = PopulationYear4 + AnnualNewPopulation;

        System.out.println("Population now: " + CurrentPopulation);
        System.out.println("Population after one year: " + PopulationYear1);
        System.out.println("Population after two years: " + PopulationYear2);
        System.out.println("Population after three years: " + PopulationYear3);
        System.out.println("Population after four years: " + PopulationYear4);
        System.out.println("Population after five years: " + PopulationYear5);
    }
}