public class HomeWorkFractionCalculator {


    public static HomeWorkFraction sumFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {

        if (fr1.getWholePart() < 0) {
            throw new IllegalArgumentException("Целая часть не может быть отрицательной");
        }
        if (fr1.getNumerator() < 0) {
            throw new IllegalArgumentException("Числитель не может быть отрицательным");
        }
        if (fr1.getDenominator() < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        if (fr1.getDenominator() == 0) {
            throw new NullPointerException("Знаменатель не может быть нулевым");
        }
        if (fr2.getWholePart() < 0) {
            throw new IllegalArgumentException("Целая часть не может быть отрицательной");
        }
        if (fr2.getNumerator() < 0) {
            throw new IllegalArgumentException("Числитель не может быть отрицательным");
        }
        if (fr2.getDenominator() < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        if (fr2.getDenominator() == 0) {
            throw new NullPointerException("Знаменатель не может быть нулевым");
        }

        if (fr1.getWholePart() > 0) {//Проверяем есть ли целая часть и приводи ее в дробь
            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
            fr1.setWholePart(0);
        }
        if (fr2.getWholePart() > 0) {
            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
            fr2.setWholePart(0);
        }

        int comNumerator = (fr1.getNumerator() * fr2.getDenominator()) + (fr2.getNumerator() * fr1.getDenominator());

        int comDenominator = (fr1.getDenominator() * fr2.getDenominator());

        while (comNumerator % 2 == 0 && comDenominator % 2 == 0 || comNumerator % 3 == 0 && comDenominator % 3 == 0) {
            for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
                if (comNumerator % i == 0 && comDenominator % i == 0) {
                    comNumerator = (comNumerator / i);
                    comDenominator = (comDenominator / i);
                    break;
                }
            }
        }

        int wholeUsed = (comNumerator / comDenominator) * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает
        if (comNumerator == comDenominator) { // если числитель равен занменателю
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
            return resultFr1Fr2;
        } else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
            if (comDenominator == 1) {
                HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, 0);
                return resultFr1Fr2;
            }
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
            return resultFr1Fr2;
        } else {
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь
            return resultFr1Fr2;
        }
    }

    public static HomeWorkFraction differenceFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {

        if (fr1.getWholePart() < 0) {
            throw new IllegalArgumentException("Целая часть не может быть отрицательной");
        }
        if (fr1.getNumerator() < 0) {
            throw new IllegalArgumentException("Числитель не может быть отрицательным");
        }
        if (fr1.getDenominator() < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        if (fr1.getDenominator() == 0) {
            throw new NullPointerException("Знаменатель не может быть нулевым");
        }
        if (fr2.getWholePart() < 0) {
            throw new IllegalArgumentException("Целая часть не может быть отрицательной");
        }
        if (fr2.getNumerator() < 0) {
            throw new IllegalArgumentException("Числитель не может быть отрицательным");
        }
        if (fr2.getDenominator() < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        if (fr2.getDenominator() == 0) {
            throw new NullPointerException("Знаменатель не может быть нулевым");
        }

        if (fr1.getWholePart() > 0) {//Проверяем есть ли целая часть и приводи ее в дробь
            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
            fr1.setWholePart(0);
        }
        if (fr2.getWholePart() > 0) {
            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
            fr2.setWholePart(0);
        }

        int comNumerator = (fr1.getNumerator() * fr2.getDenominator()) - (fr2.getNumerator() * fr1.getDenominator());

        int comDenominator = (fr1.getDenominator() * fr2.getDenominator());

        while (comNumerator % 2 == 0 && comDenominator % 2 == 0 || comNumerator % 3 == 0 && comDenominator % 3 == 0) {
            for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
                if (comNumerator % i == 0 && comDenominator % i == 0) {
                    comNumerator = (comNumerator / i);
                    comDenominator = (comDenominator / i);
                    break;
                }
            }
        }

        int wholeUsed = (comNumerator / comDenominator) * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает
        if (comNumerator == comDenominator) { // если числитель равен занменателю
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
            return resultFr1Fr2;
        } else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
            if (comDenominator == 1) {
                HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, 0);
                return resultFr1Fr2;
            }
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
            return resultFr1Fr2;
        } else {
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь
            return resultFr1Fr2;
        }
    }

    public static HomeWorkFraction multiplicationFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {

        if (fr1.getWholePart() < 0) {
            throw new IllegalArgumentException("Целая часть не может быть отрицательной");
        }
        if (fr1.getNumerator() < 0) {
            throw new IllegalArgumentException("Числитель не может быть отрицательным");
        }
        if (fr1.getDenominator() < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        if (fr1.getDenominator() == 0) {
            throw new NullPointerException("Знаменатель не может быть нулевым");
        }
        if (fr2.getWholePart() < 0) {
            throw new IllegalArgumentException("Целая часть не может быть отрицательной");
        }
        if (fr2.getNumerator() < 0) {
            throw new IllegalArgumentException("Числитель не может быть отрицательным");
        }
        if (fr2.getDenominator() < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        if (fr2.getDenominator() == 0) {
            throw new NullPointerException("Знаменатель не может быть нулевым");
        }
        if (fr1.getNumerator() == 0) {
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(0, 0, 0);
            return resultFr1Fr2;
        }

        if (fr1.getWholePart() > 0) {//Проверяем есть ли целая часть и приводи ее в дробь
            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
            fr1.setWholePart(0);
        }
        if (fr2.getWholePart() > 0) {
            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
            fr2.setWholePart(0);
        }

        int comNumerator = (fr1.getNumerator() * fr2.getNumerator());

        int comDenominator = (fr1.getDenominator() * fr2.getDenominator());

        while (comNumerator % 2 == 0 && comDenominator % 2 == 0 || comNumerator % 3 == 0 && comDenominator % 3 == 0) {
            for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
                if (comNumerator % i == 0 && comDenominator % i == 0) {
                    comNumerator = (comNumerator / i);
                    comDenominator = (comDenominator / i);
                    break;
                }
            }
        }

        int wholeUsed = (comNumerator / comDenominator) * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает
        if (comNumerator == comDenominator) { // если числитель равен занменателю
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
            return resultFr1Fr2;
        } else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
            if (comDenominator == 1) {
                HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, 0);
                return resultFr1Fr2;
            }
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
            return resultFr1Fr2;
        } else {
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь
            return resultFr1Fr2;
        }
    }

    public static HomeWorkFraction divisionFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {

        if (fr1.getWholePart() < 0) {
            throw new IllegalArgumentException("Целая часть не может быть отрицательной");
        }
        if (fr1.getNumerator() < 0) {
            throw new IllegalArgumentException("Числитель не может быть отрицательным");
        }
        if (fr1.getDenominator() < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        if (fr1.getDenominator() == 0) {
            throw new NullPointerException("Знаменатель не может быть нулевым");
        }
        if (fr2.getWholePart() < 0) {
            throw new IllegalArgumentException("Целая часть не может быть отрицательной");
        }
        if (fr2.getNumerator() < 0) {
            throw new IllegalArgumentException("Числитель не может быть отрицательным");
        }
        if (fr2.getDenominator() < 0) {
            throw new IllegalArgumentException("Знаменатель не может быть отрицательным");
        }
        if (fr2.getDenominator() == 0) {
            throw new NullPointerException("Знаменатель не может быть нулевым");
        }
        if (fr1.getNumerator() == 0) {
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(0, 0, 0);
            return resultFr1Fr2;
        }
        if (fr1.getWholePart() > 0) {//Проверяем есть ли целая часть и приводи ее в дробь
            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
            fr1.setWholePart(0);
        }
        if (fr2.getWholePart() > 0) {
            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
            fr2.setWholePart(0);
        }


        int comNumerator = (fr1.getNumerator() * fr2.getDenominator());

        int comDenominator = (fr1.getDenominator() * fr2.getNumerator());

        while (comNumerator % 2 == 0 && comDenominator % 2 == 0 || comNumerator % 3 == 0 && comDenominator % 3 == 0) {
            for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
                if (comNumerator % i == 0 && comDenominator % i == 0) {
                    comNumerator = (comNumerator / i);
                    comDenominator = (comDenominator / i);
                    break;
                }
            }
        }

        int wholeUsed = (comNumerator / comDenominator) * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает
        if (comNumerator == comDenominator) { // если числитель равен занменателю
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
            return resultFr1Fr2;
        } else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
            if (comDenominator == 1) {
                HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, 0);
                return resultFr1Fr2;
            }
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
            return resultFr1Fr2;
        } else {
            HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь
            return resultFr1Fr2;
        }

    }
//    public static HomeWorkFraction differenceFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {
//
//        if (fr1.getWholePart() > 0) {/*Проверяем есть ли целая часть и приводи ее в дробь*/
//            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
//        }
//        if (fr2.getWholePart() > 0) {
//            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
//        }
//
//
//        int comNumerator = fr1.getNumerator() * fr2.getDenominator()
//                - fr1.getDenominator() * fr2.getNumerator();
//        int comDenominator = fr1.getDenominator() * fr2.getDenominator();
//
//
//        HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь
//
//        int whole = comNumerator / comDenominator;//Переменная если дробь неправильная, если правильная то вернет 0
//        int wholeUsed = whole * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает
//
//        if (comNumerator == comDenominator) { // если числитель равен занменателю
//            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
//        } else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
//            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
//        }
//
//        for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
//            if (comNumerator % i == 0 && comDenominator % i == 0) {
//                resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, (comNumerator - wholeUsed) / i, comDenominator / i);
//                i = 2;// если нашел первый наибольший делитель найден выйдет из цикла
//            }
//        }
//        return resultFr1Fr2;
//    }

//    public static HomeWorkFraction multiplicationFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {
//
//        if (fr1.getWholePart() > 0) {/*Проверяем есть ли целая часть и приводи ее в дробь*/
//            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
//        }
//        if (fr2.getWholePart() > 0) {
//            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
//        }/**Такое решение является неправильным т.к. при вызове нескольких методов следующий мотд считает изменёную дроб */
//
//
//        int comNumerator = fr1.getNumerator() * fr2.getNumerator();
//        int comDenominator = fr1.getDenominator() * fr2.getDenominator();
//
//
//        HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь
//
//        int whole = comNumerator / comDenominator;//Переменная если дробь неправильная, если правильная то вернет 0
//        int wholeUsed = whole * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает
//
//        if (comNumerator == comDenominator) { // если числитель равен занменателю
//            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
//        } else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
//            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
//        }
//
//        for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
//            if (comNumerator % i == 0 && comDenominator % i == 0) {
//                resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, (comNumerator - wholeUsed) / i, comDenominator / i);
//                i = 2;// если нашел первый наибольший делитель найден выйдет из цикла
//            }
//        }
//        return resultFr1Fr2;
//    }

//    public static HomeWorkFraction divisionFraction(HomeWorkFraction fr1, HomeWorkFraction fr2) {
//
//        if (fr1.getWholePart() > 0) {/*Проверяем есть ли целая часть и приводи ее в дробь*/
//            fr1.setNumerator(((fr1.getWholePart() * fr1.getDenominator()) + fr1.getNumerator()));
//        }
//        if (fr2.getWholePart() > 0) {
//            fr2.setNumerator(((fr2.getWholePart() * fr2.getDenominator()) + fr2.getNumerator()));
//        }/**Такое решение является неправильным т.к. при вызове нескольких методов следующий мотд считает изменёную дроб */
//
//
//        int comNumerator = fr1.getNumerator() * fr2.getDenominator();
//        int comDenominator = fr1.getDenominator() * fr2.getNumerator();
//
//
//        HomeWorkFraction resultFr1Fr2 = new HomeWorkFraction(comNumerator, comDenominator);// Вызываем конструктор, строим дробь
//
//        int whole = comNumerator / comDenominator;//Переменная если дробь неправильная, если правильная то вернет 0
//        int wholeUsed = whole * comDenominator;//Вычесляет целую часть, наврное можно сделать %, но  зачем если итак работает
//
//        if (comNumerator == comDenominator) { // если числитель равен занменателю
//            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, 0, 0);
//        } else if (comNumerator >= comDenominator) {//если числитель больше знаменателя
//            resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, comNumerator - wholeUsed, comDenominator);
//        }
//
//        for (int i = 9; i >= 2; i--) {// запускает цикл на сокращение дроби
//            if (comNumerator % i == 0 && comDenominator % i == 0) {
//                resultFr1Fr2 = new HomeWorkFraction(comNumerator / comDenominator, (comNumerator - wholeUsed) / i, comDenominator / i);
//                i = 2;// если нашел первый наибольший делитель найден выйдет из цикла
//            }
//        }
//        return resultFr1Fr2;
//    }

}

