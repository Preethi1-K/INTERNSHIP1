package com.xworkz.basic.building;
import com.xworkz.basic.building.office.Office;

public class BuildingRunner {

        public static void main(String[] args)
        {
            Building building = new Building();
            building.floors();
            building.rooms();

            Office office = new Office();
            office.floors();
            office.rooms();
        }
    }


