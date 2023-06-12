public class Program
{
    public static void Main(string[] args)
    {
        var day = DaysWeek.SUNDAY;

        switch (day)
        {
            case DaysWeek.MONDAY:
                Console.WriteLine("Comida Tailandesa / Frango com molho de amendoim extra");
                break;
            case DaysWeek.TUESDAY:
                Console.WriteLine("Hamburger");
                break;
            case DaysWeek.WEDNESDAY:
                Console.WriteLine("Dia de jogos");
                break;
            case DaysWeek.THURSDAY:
                Console.WriteLine("Quinta onde tudo pode acontecer");
                break;
            case DaysWeek.FRIDAY:
                Console.WriteLine("Comida chinesa");
                break;
            case DaysWeek.SATURDAY:
                Console.WriteLine("Noite da lavanderia");
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
