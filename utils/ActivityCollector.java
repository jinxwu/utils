�}�S  �\ �F���?��u
��� ��wu֩�*�OQ]� [1�k>�ӳ�F����^O�IU������V؏b�̸� Q��%p���Wq�Xk�8{X�rr2�0�H��3�I�+�՛��KS5*�"0�l���x��C�,}�6@�И䭋��("��)j�H%�d�������p��Z~TN$ʄt���EՁ�>(��s�$��4D�q#k�4����1��3�_���;���hO\�!�b�]�l��[����X�`��:ME��Q���?�.���R_��y��yp���0â���/��-$���U���8S0M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�ic static void finishAll() {
        int index = 0;
        for (Activity activity : activities) {
            if(index != 0) {
                if (!activity.isFinishing()) {
                    activity.finish();
                }
            }
            index++;
        }
    }

}