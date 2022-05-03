## Задача Двоичный фасад

Код по [ссылке](https://github.com/A-Sakhmina/netology_patterns_structural_facade/tree/master/src/main/java)

### Описание

Создан простой класс-фасад `BinOps` к набору стандартных классов джавы
(перевод из 10ой СС в 2ую `Integer.toBinaryString` и обратно `Integer.parseInt(binStr,2)`), который умеет всего две
вещи:

- складывать числа в двоичной системе счисления(метод `String sum(String arg0,String arg1)`);
- перемножать числа в двоичной системе счисления(метод `String mult(String arg0,String arg1)`).

