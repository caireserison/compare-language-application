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
    print('Comida Tailandesa / Frango com molho de amendoim extra')
    pass
elif (day == DayWeek.TUESDAY):
    print('Hamburger')
    pass
elif (day == DayWeek.WEDNESDAY):
    print('Dia de jogos')
    pass
elif (day == DayWeek.THURSDAY):
    print('Quinta onde tudo pode acontecer')
    pass
elif (day == DayWeek.FRIDAY):
    print('Comida chinesa')
    pass
elif (day == DayWeek.SATURDAY):
    print('Noite da lavanderia')
    pass
else:
    print('Bazinga!')
    pass
