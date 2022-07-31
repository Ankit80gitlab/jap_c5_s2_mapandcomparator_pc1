package com.jap.collection;

import java.util.*;

public class ResidentService {

    private static List<Resident> residentsRepository = new ArrayList<>();


    ResidentService(){

    }

    /**
     * create list of all the residents.
     */
    public boolean addResident(Resident resident)
    {
        boolean result = false;

        residentsRepository.add(resident);

        ListIterator it0 = residentsRepository.listIterator();
        while(it0.hasNext())
        {
            Resident r = (Resident)it0.next();
            if(r.getSocialSecurityNumber()== resident.getSocialSecurityNumber())
            {
                result=true;
            }
            else
            {
                result=false;
            }
        }


        return result;
    }


   //Search for people with their social security number.

    public Resident searchResident(int socialSecurityNumber){

        ListIterator it1 = residentsRepository.listIterator();

        while(it1.hasNext())
        {
            Resident r = (Resident)it1.next();
            if(r.getSocialSecurityNumber()==socialSecurityNumber)
            {
                return r;
            }
        }

       return null;
    }

   // Sort the name of the residents in alphabetical order.

    public List getAllNamesSorted(List residentsRepository){

        List<Resident> res = new ArrayList<>();
        Collections.sort(residentsRepository);

        Iterator it2 =residentsRepository.iterator();
        while(it2.hasNext())
        {
            Resident r = (Resident)it2.next();
            res.add(r);
        }

        return res;
    }

   // Fetch the list of residents based on their gender.
    public List<Resident> getAllResidentsByGender(char gender){

        List<Resident> res1 = new ArrayList<>();

        Iterator it3 =residentsRepository.iterator();
        while(it3.hasNext())
        {
            Resident r1 = (Resident)it3.next();
            if(r1.getGender()==gender)
            {
                res1.add(r1);
            }
        }

        return res1;
    }

}
