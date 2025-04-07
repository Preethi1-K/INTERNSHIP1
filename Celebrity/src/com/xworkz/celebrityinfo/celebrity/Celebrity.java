package com.xworkz.celebrityinfo.celebrity;

public class Celebrity {

        private String name;
        private String industry;
        private String nationality;
        private double netWorth;
        private String famousFor;
        private int age;
        private boolean isMarried;

        public void setName(String name)
        {
            this.name = name;
        }
        public String getName()
        {
            return name;
        }

        public void setIndustry(String industry)
        {
            this.industry = industry;
        }
        public String getIndustry()
        {
            return industry;
        }

        public void setNationality(String nationality)
        {
            this.nationality = nationality;
        }
        public String getNationality()
        {
            return nationality;
        }

        public void setNetWorth(double netWorth)
        {
            this.netWorth = netWorth;
        }
        public double getNetWorth()
        {
            return netWorth;
        }

        public void setFamousFor(String famousFor)
        {
            this.famousFor = famousFor;
        }
        public String getFamousFor()
        {
            return famousFor;
        }

        public void setAge(int age)
        {
            this.age = age;
        }
        public int getAge()
        {
            return age;
        }

        public void setIsMarried(boolean isMarried)
        {
            this.isMarried = isMarried;
        }
        public boolean getIsMarried()
        {
            return isMarried;
        }
    }


