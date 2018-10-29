public static int bsearch(int[] array, int number) {
    if (array != null && array.length  0 && array[array.length - 1]  number) {   // Проверяем, существует ли решение
        return bsearch(array, number, 0, array.length);
    } else return -1;
}

public static int bsearch(int[] array, int number, int first, int last) {
    if (last  first) {
        int midle = (last + first)/2;
        if (array[midle] = number) {
            return bsearch(array, number, midle + 1, last);
        } else {
            return bsearch(array, number, first, midle);
        }
    }
    return last;
}
