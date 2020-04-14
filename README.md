# Рассчет цикломатической сложности кода 
Для методов setNextStation и setPreviousStation

## Рассчет цикломатечиской сложности кода по формуле (из Википедии):
* M = E − N + 2P
##### M = цикломатическая сложность,
##### E = количество рёбер в графе = 8
##### N = количество узлов в графе = 7
##### P = количество компонент связности = 1

* М setNextStation = 8 - 7 + 1 = 2
* М setPreviousStation = 8 - 7 + 1 = 2

## На основании значений, генерируемых JaCoCo можно сказать, что количество unit-тестов достаточно.
Параметр Complexity в отчете Jacoco = 2, что подтверждает верность рассчетов по формуле выше и говорит о том, что 2х тестов, проверяющих 2 сценария достаточно.