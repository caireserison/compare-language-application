const DayWeek = {
    SUNDAY: 1,
    MONDAY: 2,
    TUESDAY: 3,
    WEDNESDAY: 4,
    THURSDAY: 5,
    FRIDAY: 6,
    SATURDAY: 7
  };

let day = DayWeek.SUNDAY
switch (day) {
    case DayWeek.MONDAY:
        console.log('Comida Tailandesa / Frango com molho de amendoim extra')
        break;
    case DayWeek.TUESDAY:
        console.log('Hamburger')
        break;
    case DayWeek.WEDNESDAY:
        console.log('Dia de jogos')
        break;
    case DayWeek.THURSDAY:
        console.log('Quinta onde tudo pode acontecer')
        break;
    case DayWeek.FRIDAY:
        console.log('Comida chinesa')
        break;
    case DayWeek.SATURDAY:
        console.log('Noite da lavanderia')
        break;
    default:
        console.log('Bazinga!')
        break;
}
