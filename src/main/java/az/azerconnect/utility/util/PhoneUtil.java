package az.azerconnect.utility.util;

import az.azerconnect.utility.exception.BadRequestException;

public class PhoneUtil {

    public static String format(String phoneNumber) {

        if (phoneNumber.length() < 9)
            throw new BadRequestException(
                    String.format("Phone number %s has wrong format", phoneNumber),
                    "WRONG_PHONE_NUMBER_FORMAT"
            );

        return "994" + phoneNumber.substring(phoneNumber.length() - 9);
    }
}
