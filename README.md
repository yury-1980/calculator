# Задача. Консольное приложение “Калькулятор”
#### Описание решения:
* Задача содержит метод **calc**
* А также тесты
### Запуск:

После запуска приложения введите число, пробел, знак операции, пробел и второе число. Пример: **7 + 3**
* Для выхода из приложения введите: **exit**
* Или любую неверную строку, для выброса Exception

##### Описание задачи:
Приложение должно читать из консоли введенные пользователем строки, числа, арифметические операции, проводимые между ними и выводить в консоль результат их выполнения.
Реализуйте класс Main с методом public static String calc(String input). Метод должен принимать строку с арифметическим выражением между двумя числами и возвращать строку с результатом их выполнения. Вы можете добавлять свои импорты, классы и методы.
Добавленные классы не должны иметь модификаторы доступа (public или другие).

##### Требования:
1. Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b. Данные передаются в одну строку (смотрите пример)! Решения, в которых каждое число и арифметическая операция передаются с новой строки считаются неверными.
2. Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине и могут быть любыми.
3. Калькулятор умеет работать только с целыми числами.
4. При вводе пользователем неподходящих чисел приложение выводит исключение и завершает свою работу.
5. При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций, приложение выводит исключение и завершает свою работу.
6. Результатом операции деления является целое число, остаток отбрасывается.
7. Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.


## Пример работы программы:
##### Input: 1 + 2 -- Output: 3


##### Input: 1 -- Output: throws Exception 
##### Input: 1 + 2 1 -- Output: throws Exception
##### Input: 1 + 2 + 3 -- Output: throws Exception 


