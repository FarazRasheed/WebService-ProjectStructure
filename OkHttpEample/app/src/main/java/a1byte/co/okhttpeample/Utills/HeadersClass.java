package a1byte.co.okhttpeample.Utills;

import java.util.HashMap;

/**
 * Created by Admin on 11/7/2016.
 */

public class HeadersClass {

    public static HashMap<String, String> Headers(){
        HashMap<String, String> headers = new HashMap<String, String>();
        headers.put("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyIkX18iOnsic3RyaWN0TW9kZSI6dHJ1ZSwiZ2V0dGVycyI6e30sIndhc1BvcHVsYXRlZCI6ZmFsc2UsImFjdGl2ZVBhdGhzIjp7InBhdGhzIjp7InBhc3N3b3JkIjoiaW5pdCIsImVtYWlsIjoiaW5pdCIsIl9fdiI6ImluaXQiLCJ1cGRhdGVkX2F0IjoiaW5pdCIsImNyZWF0ZWRfYXQiOiJpbml0IiwibmFtZSI6ImluaXQiLCJfaWQiOiJpbml0In0sInN0YXRlcyI6eyJpZ25vcmUiOnt9LCJkZWZhdWx0Ijp7fSwiaW5pdCI6eyJfX3YiOnRydWUsInVwZGF0ZWRfYXQiOnRydWUsImNyZWF0ZWRfYXQiOnRydWUsInBhc3N3b3JkIjp0cnVlLCJuYW1lIjp0cnVlLCJlbWFpbCI6dHJ1ZSwiX2lkIjp0cnVlfSwibW9kaWZ5Ijp7fSwicmVxdWlyZSI6e319LCJzdGF0ZU5hbWVzIjpbInJlcXVpcmUiLCJtb2RpZnkiLCJpbml0IiwiZGVmYXVsdCIsImlnbm9yZSJdfSwiZW1pdHRlciI6eyJkb21haW4iOm51bGwsIl9ldmVudHMiOnt9LCJfZXZlbnRzQ291bnQiOjAsIl9tYXhMaXN0ZW5lcnMiOjB9fSwiaXNOZXciOmZhbHNlLCJfZG9jIjp7Il9fdiI6MCwidXBkYXRlZF9hdCI6IjIwMTYtMTEtMDRUMTE6Mzc6MjkuODIyWiIsImNyZWF0ZWRfYXQiOiIyMDE2LTExLTA0VDExOjM3OjI5LjgyMloiLCJwYXNzd29yZCI6IjEyMzQ1IiwibmFtZSI6IkFkbWluIiwiZW1haWwiOiJhZG1pbkBvbWcuY29tIiwiX2lkIjoiNTgxYzcyZjlhMGViNzY2MjIxMWM2ZDE0In0sIl9wcmVzIjp7IiRfX29yaWdpbmFsX3NhdmUiOltudWxsLG51bGxdLCIkX19vcmlnaW5hbF92YWxpZGF0ZSI6W251bGxdLCIkX19vcmlnaW5hbF9yZW1vdmUiOltudWxsXX0sIl9wb3N0cyI6eyIkX19vcmlnaW5hbF9zYXZlIjpbXSwiJF9fb3JpZ2luYWxfdmFsaWRhdGUiOltdLCIkX19vcmlnaW5hbF9yZW1vdmUiOltdfSwiaWF0IjoxNDc4NTA4NTkyfQ.KZl1S7zy-YpXMY_cJf8dJmGtKyNrSEk7ZoMpJ8dxWrg");

        return headers;
    }


    public static HashMap<String, String> EmptyHeaders(){
        HashMap<String, String> headers = new HashMap<String, String>();

        return headers;
    }
}
