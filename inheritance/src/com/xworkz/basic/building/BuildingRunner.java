package com.xworkz.basic.building;
import com.xworkz.basic.building.office.Office;

public class BuildingRunner {

        public static void main(String[] args)
        {
            Building building = new Office();
            Office office=(Office) building;
           office.floors();
           office.rooms();

        }
    }


