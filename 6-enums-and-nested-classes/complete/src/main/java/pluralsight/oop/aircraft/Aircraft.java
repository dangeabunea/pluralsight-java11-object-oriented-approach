package pluralsight.oop.aircraft;

public class Aircraft {
    private final String model;
    private final WakeTurbulence wakeTurbulence;
    private final int modeADecimal;

    public Aircraft(int modeADecimal, String model, WakeTurbulence wakeTurbulence) {
        this.model = model;
        this.wakeTurbulence = wakeTurbulence;
        this.modeADecimal = modeADecimal;
    }

    public int getModeADecimal() {
        return modeADecimal;
    }

    public String getModeAOctal() {
        class ModeACode {
            private String octal;

            public ModeACode() {
                int decimalValue = Aircraft.this.modeADecimal;

                if (decimalValue < 0 || decimalValue > 7777) {
                    this.octal = null;
                }

                String octalValue = Integer.toOctalString(decimalValue);

                // Append leading zeros
                if (octalValue.length() == 4) {
                    this.octal = octalValue;
                }
                if (octalValue.length() == 3) {
                    this.octal = "0" + octalValue;
                }
                if (octalValue.length() == 2) {
                    this.octal = "00" + octalValue;
                }
                if (octalValue.length() == 1) {
                    this.octal = "000" + octalValue;
                }
            }

            public String getOctal() {
                return octal;
            }
        }

        ModeACode modeACode = new ModeACode();
        return modeACode.getOctal();
    }

    public String getModel() {
        return model;
    }

    public WakeTurbulence getWakeTurbulence() {
        return wakeTurbulence;
    }
}