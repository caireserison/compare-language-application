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
        console.log('Thai food / Mee Krob and chicken satay with extra peanut sauce')
        break;
    case DayWeek.TUESDAY:
        console.log('Burger')
        break;
    case DayWeek.WEDNESDAY:
        console.log('Games')
        break;
    case DayWeek.THURSDAY:
        console.log('Anything Can Happen Thursday')
        break;
    case DayWeek.FRIDAY:
        console.log('Chinese food')
        break;
    case DayWeek.SATURDAY:
        console.log('Laundry night')
        break;
    default:
        console.log('Bazinga!')
        break;
}
