�}oS  /u ��^9��m��u
����gu&��*ŊI�� R�=r��m(Yz2Mu���2c%�с������%K0r��ϔ��L���+�?��u��B�g	�%��H�Gņ=��֘5��H�]I��&��d⻊�-Z�j��+rr��jk�
2$8K�`�ov�}��s}�Jzc[���F���4��:���w	[I��%�_4 a��s�"<s͐��6T��0�T0�;w�}��FDJ�<U>�&S�ި��2WL�]}�	
Jw\�D��&���4�Uqg�µ�u�]K���G���Hj)���/��-$���U���8S0M$}ۢ���$�z��!���K��&��:[�	,���@\��OD�����ÂQ؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�lD%T��&>@?�)x�����L]9�La��%���σ�_��	2<���X�h&4�æ�e@��^����#����v4�cy��&ؠ�E�H�+9���q8��fW��<|8M�����8M/���uL���"t���n�rv�_�Î�\KʸY.+ȷs���^�d��$�O�Fv�+��UЉ��p%��{��
x�?�Y����:N"�_QD��:]�/�[�	q�e(h����ݟ&f��҅]��윚e����"�E����
�\��*�.�g����=q��-�Rc��v���9�l�8$�>6��>�2?�œ=�Mu�yN)rcİ()l,M������ݙ�N��?�-\R�/yP�5H��gt����}�5��n�����%��	8����-�x��vg��]\�N��{����~G�2�E�Vm�b�"\ܬƓ8WT��7B�M~�ʙ�i4�h���8BW�#&|iyZܻE�$z��;~��o��j�e}�lD(�V0�{3o��;�ȄtkAu�Xx b�x�uac���;4i�[7�iC�������pi!05*�[s��_�6��3��ܘ$�#��o���v�:p���
?��bV��[�.�:Т��w�k;	�[ph��j�y4�/�E){7j#����ҠxDӧ@�ݯd����Kl���lRn@o�%��O@�s�<>s��l��:
F&fճif@�Lb_f�P��ј����T��J�8"apX.�I*���c.Wcmv�=��o�S�B���~P�1�F�xR>9S���q�P�~�P%H�˅C V� M�1`t�{!�\L��>�z@���Ǔ�^�Ͻ�w���Z� �nbd�0�v����ф�"���H �G��GKa����i�bO��`��1�ԓ�сQY@�޼������tC^*$�f��钉RC}�!��*������`��G���q!��xܲ�b$�۫�hT����&��"�&�k{��� ���촤�+:�ad/C��ent.ACTION_DOWN:
            case MotionEvent.ACTION_MOVE:
            case MotionEvent.ACTION_UP:
                setProgress(getMax()
                        - (int) (getMax() * event.getY() / getHeight()));
                onSizeChanged(getWidth(), getHeight(), 0, 0);
                break;

            case MotionEvent.ACTION_CANCEL:
                break;
        }

        return true;
    }
}
