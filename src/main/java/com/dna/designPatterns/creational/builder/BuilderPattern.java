package com.dna.designPatterns.creational.builder;

public class BuilderPattern {

    /*
    Handles complex constructors and Large number of parameters
    Can enforce immutability once the object created
    It solve the problem to determine which constructor to use
    Creating a constructor with each parameter variation is called telescoping constructors
    Builder is commonly written with a static inner class but can also be written in separate class
    Negates the need for exposed setters
    E.g. StringBuilder, it is more clean way instead of using + operator in String
    StringBuilder has better performance than StringBuffer

    ################ Pitfalls ########################
    Complexity
    * */

    // For demo fields are created to accept a breakfast order

    public static class Builder {
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public BuilderPattern build() {
            return new BuilderPattern(this);
        }
        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }
        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }
        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }
        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private BuilderPattern(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "bread='" + bread + '\'' +
                ", condiments='" + condiments + '\'' +
                ", dressing='" + dressing + '\'' +
                ", meat='" + meat + '\'' +
                '}';
    }
}
