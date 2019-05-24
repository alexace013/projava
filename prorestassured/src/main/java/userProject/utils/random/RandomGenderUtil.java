package userProject.utils.random;

import lombok.AllArgsConstructor;
import lombok.Getter;

public class RandomGenderUtil {

    /**
     * This static method can get gender
     * it means you can get gender as man or as a woman
     *
     * @param isMan if true you can get gender as man,
     *              otherwise you can get gander as a woman
     * @return man or woman gender
     */
    public static String getGender(final boolean isMan) {
        return isMan ? Gender.M.getGender() : Gender.W.getGender();
    }

    @Getter
    @AllArgsConstructor
    private enum Gender {
        M("man"),
        W("woman");
        private String gender;
    }
}
