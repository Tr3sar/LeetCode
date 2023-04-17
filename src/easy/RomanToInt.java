package easy;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(solution("CCCI"));
    }
    public static int solution(String s) {
        String[] romanArray = s.split("");
        int res = 0;

        for (int i = 0; i < romanArray.length - 1; i++) {
            switch(romanArray[i]) {
                case "I": {
                    int sumaTemp = 1;
                    int repeticions = 1;

                    while (i + 1 < romanArray.length - 1 && romanArray[i+1].compareTo("I") == 0) {
                         sumaTemp += 1;
                         repeticions += 1;
                         i++;
                    }

                    if ((i + repeticions) < romanArray.length &&  romanArray[i + repeticions].compareTo("I") != 0) {
                        res -= sumaTemp;
                    } else {
                        res += sumaTemp;
                    }

                    break;
                }
                case "V": {
                    int sumaTemp = 5;
                    int repeticions = 1;

                    while (i + 1 < romanArray.length - 1 && romanArray[i+1].compareTo("V") == 0) {
                        sumaTemp += 5;
                        repeticions += 1;
                        i++;
                    }

                    if ((i + repeticions) < romanArray.length && romanArray[i + repeticions].compareTo("I") != 0 && romanArray[i + repeticions].compareTo("V") != 0) {
                        res -= sumaTemp;
                    } else {
                        res += sumaTemp;
                    }
                    break;
                }
                case "X": {
                    int sumaTemp = 10;
                    int repeticions = 1;

                    while (i + 1 < romanArray.length - 1 && romanArray[i+1].compareTo("X") == 0) {
                        sumaTemp += 10;
                        repeticions += 1;
                        i++;
                    }

                    if ((i + repeticions) < romanArray.length && romanArray[i + repeticions].compareTo("I") != 0  && romanArray[i + repeticions].compareTo("V") != 0 &&
                            romanArray[i + repeticions].compareTo("X") != 0) {
                        res -= sumaTemp;
                    } else {
                        res += sumaTemp;
                    }
                    break;
                }
                case "L": {
                    int sumaTemp = 50;
                    int repeticions = 1;

                    while (i + 1 < romanArray.length - 1 && romanArray[i+1].compareTo("L") == 0) {
                        sumaTemp += 50;
                        repeticions += 1;
                        i++;
                    }

                    if ((i + repeticions) < romanArray.length && romanArray[i + repeticions].compareTo("I") != 0  && romanArray[i + repeticions].compareTo("V") != 0 &&
                            romanArray[i + repeticions].compareTo("X") != 0 && romanArray[i + repeticions].compareTo("L") != 0) {
                        res -= sumaTemp;
                    } else {
                        res += sumaTemp;
                    }
                    break;
                }
                case "C": {
                    int sumaTemp = 100;
                    int repeticions = 1;

                    while (i + 1 < romanArray.length - 1 && romanArray[i+1].compareTo("C") == 0) {
                        sumaTemp += 100;
                        repeticions += 1;
                        i++;
                    }

                    if ((i + repeticions) < romanArray.length && romanArray[i + repeticions].compareTo("I") != 0  && romanArray[i + repeticions].compareTo("V") != 0 &&
                            romanArray[i + repeticions].compareTo("X") != 0 && romanArray[i + repeticions].compareTo("L") != 0 &&
                        romanArray[i + repeticions].compareTo("C") != 0) {
                        res -= sumaTemp;
                    } else {
                        res += sumaTemp;
                    }
                    break;
                }
                case "D": {
                    int sumaTemp = 500;
                    int repeticions = 1;

                    while (i + 1 < romanArray.length - 1 && romanArray[i+1].compareTo("D") == 0) {
                        sumaTemp += 500;
                        repeticions += 1;
                        i++;
                    }

                    if ((i + repeticions) < romanArray.length && romanArray[i + repeticions].compareTo("I") != 0  && romanArray[i + repeticions].compareTo("V") != 0 &&
                            romanArray[i + repeticions].compareTo("X") != 0 && romanArray[i + repeticions].compareTo("L") != 0 &&
                            romanArray[i + repeticions].compareTo("C") != 0 && romanArray[i + repeticions].compareTo("D") != 0) {
                        res -= sumaTemp;
                    } else {
                        res += sumaTemp;
                    }
                    break;
                }
                case "M": {
                    int sumaTemp = 1000;
                    int repeticions = 1;

                    while (i + 1 < romanArray.length - 1 && romanArray[i+1].compareTo("M") == 0) {
                        sumaTemp += 1000;
                        repeticions += 1;
                        i++;
                    }

                    res += sumaTemp;
                    break;
                }
            }
        }

        switch(romanArray[romanArray.length -1]) {
            case "I": {
                res += 1;
                break;
            }
            case "V": {
                res += 5;
                break;
            }
            case "X": {
                res += 10;
                break;
            }
            case "L": {
                res += 50;
                break;
            }
            case "C": {
                res += 100;
                break;
            }
            case "D": {
                res += 500;
                break;
            }
            case "M": {
                res += 1000;
                break;
            }
        }

        return res;
    }

    public int betterSolution(String s) {
        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }
}
