package com.example.heretohelpserver.Common;

import com.example.heretohelpserver.Model.User;

public class Common {
    public static User currentUser;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static final int PICK_IMAGE_REQUEST = 71;

    public static String convertCodeToStatus(String status) {
        if(status.equals("0"))
            return "Request sent";
        else if(status.equals("1"))
            return "On my way";
        else
            return "Donated";
    }
}
