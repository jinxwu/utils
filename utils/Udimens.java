�}�S  �\ B�N.�ؿ�u
��� ��j։�*�O�1���^�ގ��2~.atΉ#�;�w�r��I�}�#�֓�Z����gd���uۉ6=���s}��,��`�q�Z�mu|�3����
.-���0��a�B��}k�VW�0��&���~�{G�R�7Ʋ����3��PR���h�3,K�;�m0�P�J��Z��e����Ӫ��E�`�D��C�wx�$'�m�B:c�����z!��>]�>��o�NQ#���1rJ*j���j��B<M����?�.���R_��y��yp���0â���/��-$���U���8S0M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�l�<F��:�¯�����m<B�e�s��\Z��w
A�k
ܜ9�S�)v��y�n�JO�l�ԃGV���$svb"*����K�7h���������9MZ�B��/��M��۷���h2x�e����^���5�k�!`�$�(�����2��s~��#��Yu�w��c����3͑����n ,�'a��n�i�a -���t('qBN)�|7C���~j{�Y*a=s|�[����#�T�¯Vs_٣� c���S�FUJ��P��Eza�����9(��_�T) -��/��~i�2�p�O
��*R�$�Zxb�l�r
<��xF·�!�/Ǖ�w������<y_��2y��)����`�8//���@�Y�>:
��f�$ˆ$��ާH�z<���<Fer�v���rR*Q�i�c_�R�*���?�)��A�K_8o��q6��8��/��zc��J��o3�/���]�g�����d�ՙ���u�$>��% ��b<cL�[]�*�,t�/�oN�=blic static int dp2Px(Context context, float dp) {
        float px = (int) (getScreenDensity(context) * dp);
        return (int) (px + 0.5f);
    }

    public static float sp2Px(Context context, float sp) {
        float px = getScreenScaleDensity(context);
        return sp * px;
    }
}