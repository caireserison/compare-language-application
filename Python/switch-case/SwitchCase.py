import enum
class DayWeek(enum.Enum):
    SUNDAY = 1
    MONDAY = 2
    TUESDAY = 3
    WEDNESDAY = 4
    THURSDAY = 5
    FRIDAY = 6
    SATURDAY = 7

day = DayWeek.SUNDAY
if (day == DayWeek.MONDAY):
    print('Thai food / Mee Krob and chicken satay with extra peanut sauce')
    pass
elif (day == DayWeek.TUESDAY):
    print('Burger')
    pass
elif (day == DayWeek.WEDNESDAY):
    print('Games')
    pass
elif (day == DayWeek.THURSDAY):
    print('Anything Can Happen Thursday')
    pass
elif (day == DayWeek.FRIDAY):
    print('Chinese food')
    pass
elif (day == DayWeek.SATURDAY):
    print('Laundry night')
    pass
else:
    print('Bazinga!')
    pass
