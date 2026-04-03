package com.example.microphone_shashin.datas.permissions;

import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;

public class PermissionHelper {
    public static boolean CheckPermission(Context context) {
        Boolean AudioPermission = context.checkSelfPermission(
                Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED;
        return AudioPermission;
    }
}
