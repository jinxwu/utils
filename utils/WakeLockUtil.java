�}�S  �\ ��.J���z��u
��b�ꇵک[�'��D\nR��L���!�ܾjܿ������;/F ϴ�y�^�)7y�EAP*��v�Q��.���r��� �����M��6�|�HԠ낶��*n��C��XyΠB�y%⋹���'�P4�pM>��+���?��=�D����2ӝ)�	P�ya��#�!�
�}��Q5l��9u��S}P��]G�2"��3�D�\�2B��_7������k�@D�(��,a����\�%�Н����D�訯D*O��[*u�N��`��:�k�e�=�E'���Di3o�y���$b�w���n��#t.X@�5�}XEG�h(�j@�f94�9���Ng+�#F��gn+����K� ��Q؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�mService(Context.POWER_SERVICE);
            wakeLock = pm.newWakeLock(PowerManager.PARTIAL_WAKE_LOCK|PowerManager.ON_AFTER_RELEASE, "HEMSService");
            if (null != wakeLock)
            {
                wakeLock.acquire();
            }
        }
    }

    //释放设备电源锁
    public static void releaseWakeLock()
    {
        if (null != wakeLock)
        {
            wakeLock.release();
            wakeLock = null;
        }
    }
}
