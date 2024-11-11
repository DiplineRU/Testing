ru text

#  **Тестирование**

> Ваша задача на сегодня: написать простую версию калькулятора и покрыть ее тестами.
Следуйте инструкции ниже, чтобы справиться с заданием.



Этап 1: создание калькулятора
Шаг 1
Создать Spring Boot проект calculator.

Шаг 2
Подключить модуль Spring Web при создании.

Шаг 3
Написать 5 методов, которые при вызове из браузера делают следующее:

- Метод по адресу /calculator должен вернуть приветствие "Добро пожаловать в калькулятор".
- Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате "5 + 5 = 10".
- Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате "5 − 5 = 0".
- Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате "5 * 5 = 25".
- Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате "5 / 5 = 1".

**Этап 2:** покрытие кода тестами
Перед добавлением зависимостей проверьте, что в вашем проекте (pom.xml) отсутствует зависимость 
spring-boot-starter-test.

Если эта зависимость присутствует в вашем проекте (добавляется автоматически при генерации Spring-проекта), то отдельно подключать JUnit не требуется.

**Шаг 1.** Доработать метод деления.

Теперь, в случае передачи в качестве второго параметра числа 0, нужно выбрасывать исключение своего наследника IllegalArgumentException из метода калькулятора с соответствующим текстом ошибки. Использовать для проверки параметра контроллер больше нельзя.

**Шаг 2.** Создать тестовый класс и написать в нем тесты для всех методов калькулятора. По 2 набора параметров на каждый.

На метод деления написать дополнительный тест с проверкой выбрасывания исключения.

**Шаг 3.** Создать тестовый класс и написать в нем параметризованные тесты для методов калькулятора.

Учтите, что может потребоваться написать 4 параметризованных теста и один или несколько методов с набором аргументов. Тест на исключение дублировать не надо.


eng text

# **Testing**

> Your task for today is to write a simple version of the calculator and cover it with tests.
Follow the instructions below to complete the task.



Step 1: Creating a calculator
Step 1
Create a Spring Boot calculator project.

Step 2
Connect the Spring Web module when creating.

Step 3
Write 5 methods that, when called from the browser, do the following:

- The method at /calculator should return the greeting "Welcome to the calculator".
- The method at /calculator/plus?num1=5&num2=5 should add num1 and num2 and return the result in the format "5 + 5 = 10".
- The method at /calculator/minus?num1=5&num2=5 should subtract num2 from num1 and return the result in the format "5 − 5 = 0".
- The method at /calculator/multiply?num1=5&num2=5 should multiply num1 by num2 and return the result in the format "5 * 5 = 25".
- The method at /calculator/divide?num1=5&num2=5 should divide num1 by num2 and return the result in the format "5/5 = 1".

**Stage 2:** Code coverage with tests
Before adding dependencies, check what is in your project (pom.xml ) there is no dependency 
spring-boot-starter-test.

If this dependency is present in your project (it is added automatically when generating a Spring project), then you do not need to connect JUnit separately.

**Step 1.** Refine the division method.

Now, if the number 0 is passed as the second parameter, you need to throw the exception of your heir IllegalArgumentException from the calculator method with the corresponding error text. You can no longer use the controller to check the parameter.

**Step 2.** Create a test class and write tests for all calculator methods in it. There are 2 sets of parameters for each.

Write an additional test for the division method to check for throwing an exception.

**Step 3.** Create a test class and write parameterized tests for calculator methods in it.

Note that you may need to write 4 parameterized tests and one or more methods with a set of arguments. There is no need to duplicate the exclusion test.
