�}�S  Ny �%�Ȏ���u
��b��jة+�Q^�4)\���B������8p��]V�`LbB�~�ވU�+`����]`��QĘ��I��Rw��13 dɦ�5�:Jp��~D����������G�q������\%�f���@du�* ���a�x4)�B�f<���㗵� �C�W�%�`X��_�����I�oL�@�|�j�Y��==`jT����O�wD�j3��+��Z�f1V�{3wzYG��'^KH����A�|ؗ^�q/��l�I���P��;�b �8�T}t�|�q�YOqX�ViD���ӓ��;�LN�I�j�͋��qK��?��G��FG�\dp�؄����@�IB�Q؍��C�����Ϋ��5�;�h"�3�AjT{*�r��¬FPڳs���\�ʴ`�V/,�2_I��y���� �mX����������>�i�f@�w��DZ���g���4�� B�%�OY;i4O�:��/�/�lD%T�����L��;h����^(�̊�8T�u�P�gβ嵿�X7q\�W�>��X���(��,�#+x|�B1۪�x����3R�������OG�]&9��p=Y���C�gM"��o?F\�~-�����C%��ڭ}wjc�� ����{�\K��KWX��Q'Ɛ�
�8��s�kR��A%Yj�n��7��s��M�8)��~��G�T?�D�Їp�:H$�i1BV��-L�jl��YF�x9_��Ǘ��n4�؛�����!�\��I�-�V����C�F�4�$�N
�]��c��x)���Rc��v���9�l�8$�>j��h�whŌ�n�M6�-8.	䰬c]£2,jS:�ֶ�؜���j�P��-\R�|, �gF��
1����C�}��g�����mWԻIq����-�x��vg��]\�N��{����~G�2�E�Vm�b�"\ܬƓ8WT��7B�M~�ʙ�i4�h���8BW�#&|iyZܻE�$z��;~��oӪj�}�l�%�� ���B�����#\��m[Y��n�1m���Nh>��༶�r����.���ք�8�<{Qt�¯Cᦥ�%�%@�_��Vsm�xE�7&	:b���3	�1�}n(O���/���79虊g����L^�]����4�^La|���%��4��Q%��uO�)Y��o��˔a���nMV��O*���1���9'�vg����E�KC2G-��d�d|7p��tuY�k���?�⧸���[�xG����X�Sab��Gɣ����c2� *̎�(���i��p��LQW簭FٜޭRM��K ��3m���&�FL2���*���{:���2[�4��ȆH���R���f��r���X4B�� i�'��U��X'�'{��b6Cˬ��Q���<���yΘ�*�kc.��	�ac���؁�V����үV'y�����Gϡ�������m&߮<�g٠wtS8�J�b>�;�Cm�~�_��"4YN�C9�u~~����H��N>          IBinder token = view.getWindowToken();
                    InputMethodManager inputMethodManager = (InputMethodManager) activity
                            .getSystemService(Context.INPUT_METHOD_SERVICE);
                    inputMethodManager.hideSoftInputFromWindow(token,
                            InputMethodManager.HIDE_NOT_ALWAYS);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
