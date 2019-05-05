package com.proartz.Chapter4.Exercise7;

public enum Color {

    BLACK {
        public int getRed() { return 0;}
        public int getGreen() { return 0;}
        public int getBlue() { return 0;}
    },

    RED {
        public int getRed() { return 255;}
        public int getGreen() { return 0;}
        public int getBlue() { return 0;}
    },

    BLUE {
        public int getRed() { return 0;}
        public int getGreen() { return 0;}
        public int getBlue() { return 255;}
    },

    GREEN {
        public int getRed() { return 0;}
        public int getGreen() { return 255;}
        public int getBlue() { return 0;}
    },

    CYAN {
        public int getRed() { return 0;}
        public int getGreen() { return 148;}
        public int getBlue() { return 180;}
    },

    MAGENTA {
        public int getRed() { return 207;}
        public int getGreen() { return 3;}
        public int getBlue() { return 124;}
    },

    YELLOW {
        public int getRed() { return 255;}
        public int getGreen() { return 217;}
        public int getBlue() { return 0;}
    },

    WHITE {
        public int getRed() { return 255;}
        public int getGreen() { return 255;}
        public int getBlue() { return 255;}
    };

    public abstract int getRed();
    public abstract int getGreen();
    public abstract int getBlue();

}
