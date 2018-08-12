package com.trendyol.challenge;

/**
 * Goal of NumberConvertToText class is convert any value from -999999999 to 999999999 inclusive, to a string,
 * with 'convert' method.
 *
 * @method n The value to convert.
 * @return String representation of the value.
 */

public class NumberConvertToText {

    public static NumberConvertToText instance;

    public static final String[] units = {
            "",     // 0
            "Bir",  // 1
            "İki",  // 2
            "Üç",   // 3
            "Dört", // 4
            "Beş",  // 5
            "Altı", // 6
            "Yedi", // 7
            "Sekiz",// 8
            "Dokuz" // 9
    };

    public static final String[] tens = {
            "",        // 0
            "On",      // 1
            "Yirmi",   // 2
            "Otuz",    // 3
            "Kırk",    // 4
            "Elli",    // 5
            "Altmış",  // 6
            "Yetmiş",  // 7
            "Seksen",  // 8
            "Doksan"   // 9
    };

    static {
        try {
            instance = new NumberConvertToText();
        } catch (Exception e) {
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }


    public NumberConvertToText() {

    }


    /**
     * Convert any value from -999999999 to 999999999 inclusive, to a string.
     *
     * @param n The value to convert.
     * @return String representation of the value.
     */

    public String convert(final int n) {
        if (n < 0) {
            return "Eksi " + convert(-n);
        }

        if (n < 10) {
            return units[n];
        }

        if (n < 100) {
            return tens[n / 10] + ((n % 10 != 0) ? " " : "") + units[n % 10];
        }

        if (n < 1000) {
            return (n / 100 != 1 ? units[n / 100] : "") + " Yüz" + ((n % 100 != 0) ? " " : "") + convert(n % 100);
        }

        if (n < 100000) {
            return (n / 1000 < 10 ? (n / 1000 != 1 ? units[n / 1000] : "") : convert(n / 1000)) + " Bin" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
        }

        if (n < 1000000) {
            return (n / 1000 < 10 ? (n / 1000 != 1 ? units[n / 1000] : "") : convert(n / 1000)) + " Bin" + ((n % 10000 != 0) ? " " : "") + convert(n % 1000);
        }

        if (n < 100000000) {
            return (n / 1000000 < 10 ? units[n / 1000000] : convert(n / 1000000)) + " Milyon" + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
        }

        return (n / 1000000 < 10 ? units[n / 1000000] : convert(n / 1000000)) + " Milyon" + ((n % 1000000 != 0) ? " " : "") + convert(n % 1000000);
    }


    public static NumberConvertToText getInstance() {
        return instance;
    }


}
