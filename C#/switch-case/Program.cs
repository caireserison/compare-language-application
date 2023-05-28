public class Program
{
    public static void Main(string[] args)
    {
        var day = DaysWeek.SUNDAY;

        switch (day)
        {
            case DaysWeek.MONDAY:
                Console.WriteLine("Thai food / Mee Krob and chicken satay with extra peanut sauce");
                break;
            case DaysWeek.TUESDAY:
                Console.WriteLine("Burger");
                break;
            case DaysWeek.WEDNESDAY:
                Console.WriteLine("Games");
                break;
            case DaysWeek.THURSDAY:
                Console.WriteLine("Anything Can Happen Thursday");
                break;
            case DaysWeek.FRIDAY:
                Console.WriteLine("Chinese food");
                break;
            case DaysWeek.SATURDAY:
                Console.WriteLine("Laundry night");
                break;
            default:
                Console.WriteLine("Bazinga!");
                break;
        }
    }
}

public enum DaysWeek
{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
