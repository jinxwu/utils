�}S  +o t˚�JA��u
�� ��t���Z�OI���UpM��1E%lb4�'˙�U���b]��}��껊Cݴ�9E00�p#���Ō0O����t�*Aǩ�~��UB����Z�k�r~wv����˯b�����Vj��\�[��Ђ%%Q���(���s��,Lz�`����>���St��[�ē���a�>�f�� c���ӹ4���F���$�l�㲲Kr<���n�S\���7��4�V�TG��g +��� {��.���R_��y��yp���0â���/��-$���U���8S0M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�l+z�O�����#x|�+s�&(4�_'i��j��'2���#t�bߔ.=������o���F�&Kg-�_`���8޼z�_�֑�z걤���?��.��3�n�-�ǘ�(���r�dd7S��N6�JC��>Ǘ������J���1A�~�D��KF�,��Y�[#�^��� K��d�Q���AD�E.C:m�TT��c\&N���6N`Z��N�|j��J��r�m���m�D��W/����W�����Y:�g�F!�|��J��/TY����~d�4X�F�5�A.5Tn�5f��|j~�J���"UR3���O��r�,o��@�3ԑf�η)����
��)���[Iy ��]K�Gl�=�D�w�֔`���|4�X�)�$^]���
�����U������H�z������V��E�Pŏ��N /ێ=�U����.������t<����R]�vgS���׸���s����<y� �Z�+�`�'sH�ϸ�$d~�nF�E�1���2kl����`FV�&��o��W�\h��%
ѳ���m6�(9�R§�]Hpd�b����"�4N>��>�� ����s���<��Ks#s%����F�����̅�sp��*MB	YW���Y{X�EW�D�Em��Լ��P\� �/*���;t**l�L���~�%��+,����h���u�!^�wM��/�a�l�{�<�FX}ο� �iV�=�☫`E6�F�*'WF�ՁE��_�.i�۪Tu���8)�Uת+�������k8sP̧�Mo�$�p���D��ivkd
�34=�8�Bڏ�g�Oc�<�f {�8���`�Z��CS�n.�̆��gXW{�=�ΫW���ַ���)뛫;�.��4D�ة�ݛ�B�*�{gt9�-�X�
~�J��M�ܖ� ��{	L�ׇ]V����%7���v��3�T�oy��v��辋:�TO���6��6e�ը�������:S�c�,�Vi�&:�ϸ�J�7��El� ��xqBC�{i�4{��o�3��"�14*�����)���p�L c��?�_��O��B�T��k�+D]S�T�Z���\�;�JF��Y]��.���
������P�a�u�ח(����"����Z[<v�a6(�}鴧�8�Q�Ϩ#���2�6�- ��S�� ��(E�u~Y	k�Н��)�_]s�G�� �$mĿ&�>�T)���`��S}�i�E++�q���$�g4�;��IJp덖9g�Ɠ�V�ߒ�B��k��` a�Y)7G�0pݛ@#�*n�<��悑��	qܠ(En��ӂ�o!���i}���Oł�+1�^V4�hs\�g�P��ha�ݺ)2���X�l�z�����Zw��
j
�:���v�;z6�V�����Uf���e��.��1�&6H:Ĭ�s��Jr�����>�ڰ�K2l�PS�P�hPf�l,�^8w@n�?�#O�HX����Cn�U��I��Y�0��8�7����-z[e.CLAMP);
        mPaint.setShader(gradient);
        canvas.drawRoundRect(new RectF(0, 0, mWidth, mHeight), mHeight / 2, mHeight / 2, mPaint);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        mWidth = MeasureSpec.getSize(widthMeasureSpec);
        mHeight = MeasureSpec.getSize(heightMeasureSpec);
    }
}
