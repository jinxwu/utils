�}S  o ���< ���u
��S�ꗵ���Z�w��T��$�G���A�jV>�u�<��'� �������M|6�Y��>���#�>Դ�/�[�.����	�+�A���<������;�kTvbH�B�<9�����Bq������%�O�6��r�����.Z��A��D5�^��=�[��2�G��������R�(��]�)����m¨�Z�K
үx�]/�ʟŢ~�����]��֮�ّ �ȹ�5�gֈS"GhτV��lj�[<�DIFV�+��0!bU>o}#&�1ƓwH-��
�w�-X���V�Β+�>Ph�z�{E=ׄ
$D���f^��O
��M��1t|�ƀBA�@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�ntent);
    }

    //扫描指定目录
    public static final String ACTION_MEDIA_SCANNER_SCAN_DIR = "android.intent.action.MEDIA_SCANNER_SCAN_DIR";
    public static void scanDirAsync(Context ctx, String dir) {
        Intent scanIntent = new Intent(ACTION_MEDIA_SCANNER_SCAN_DIR);
        scanIntent.setData(Uri.fromFile(new File(dir)));
        ctx.sendBroadcast(scanIntent);
    }
}
