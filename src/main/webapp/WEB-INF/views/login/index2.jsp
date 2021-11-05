<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <title>商品情報詳細</title>

    <link rel="canonical" href="https://getbootstrap.com/docs/4.6/examples/navbar-static/">
    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
    <style>
        .page-body-style
        {
            margin-bottom:14px;
            min-height:calc(100vh - 206px);
            padding:25px;
            background-color: rgb(255, 255, 255);
            box-shadow: 0px 0px 22.5px 2.5px rgba(0, 0, 0, 0.1);
        }

        .TitlePage {
            font-size: 30px;
            letter-spacing: 3px;
            color: #0b318f;
            font-weight: bold;
            font-family: "Yu Go";
            text-align: center;
        }

        .DetailTitlePage {
            font-size: 30px;
            letter-spacing: 3px;
            color: #0b318f;
            font-weight: bold;
            font-family: "Yu Go";
            text-align: left;
            margin-left: 12px;
            margin-bottom: 10px;
        }

        .required_field {
            color: red;
        }


        .needs{
            color: #72c6bf;
        }

        .apipublic {
            color: #6b9bcf;
        }

        .seeds{
            color: #d3592f;
        }

        .ckan {
            color: #3b2fd3;
        }

        .a-checkbox_body, .a-radio_body {
            text-align: center;
            border-radius: 17px;
            border: 1px solid #fff;
            height: 34px;
            width: 200px;
            background: #fff;
            font-size: 14px;
            position: relative;
            display: flex;
            align-items: center;
            justify-content: center;
            cursor: pointer;
            transition: border .3s ease-in-out, color .3s ease-in-out;
        }

        .a-checkbox {
            margin-right: 20px;
        }

        .a-checkbox_input, .a-radio_input  {
            display: none;
        }

        .a-checkbox_Indicator {
            position: absolute;
            top: calc(50% - 5px);
            left: 15px;
        }

        .fa-check {
            color: #eee;
        }

        .a-checkbox_input:checked+.a-checkbox_body  {
            border-color: #092354;
            color: #0b318f
        }

        .a-checkbox_input:checked+.a-checkbox_body>.a-checkbox_Indicator {
            color: #092354
        }
        .a-checkbox_input:checked+.a-checkbox_body>.a-radio_indicator {
            background-color: #092354;
        }
        .a-radio:hover .a-radio_body,.a-checkbox:hover .a-checkbox_body,.a-checkbox_body:hover >.fa-check {
            border-color: #092354;
            color: #0b318f
        }

        .a-checkbox:hover .a_checkbox_body,.a-checkbox:hover + .a-checkbox_Indicator,.a-checkbox_body:hover >.a-radio_indicator{
            background-color: #092354;

        }

        .text-required_item {
            background: transparent!important;
            font-weight: normal;
            border-radius: 5px;
            border: 1px solid red!important;
            text-align: center;
            color: red;
            font-size: 12px;
            padding: 2px 3px 2px 3px;
        }

        .text-label {
            font-size: 14px;
            letter-spacing: 2px;
            color: #121212;
            font-weight: normal;
            font-family: "Yu Go";
            text-align: left;
            padding: 0;
            margin: 0;
        }

        .search-button {
            color: #fff;
            border-color: #17a2b8;
            border-radius: 5px !important;
            background-image: linear-gradient(90deg, #21409a 0%, #27aae1 50%) !important;
            float: center;
            height: 35px;
            width: 150px;
        }

        .common-center-button {
            border-radius: 5px !important;
            float: center;
            height: 35px;
            width: 150px;
        }

        .common-left-button {
            border-radius: 5px !important;
            float: left;
            height: 35px;
            margin-right: 10px;
            width: 150px;
        }

        .common-right-button {
            border-radius: 5px !important;
            float: right;
            height: 35px;
            width: 150px;
        }


        .clear-button {
            border-color: #17a2b8;
            border-radius: 5px !important;
            float: center;
            height: 35px;
            width: 150px;
        }

        .card-header-custum {
            height: 50px;
            vertical-align: middle;
            font-size: 20px;
            letter-spacing: 3px;
            color: #000000;
            font-weight: normal;
            font-family: "Yu Go";
            text-align: left;
        }

        .delete-button {
            border-radius: 5px;
            background-color: #d32f2f;
            float: center;
            border-radius: 30px !important;
            display: inline-block;
            font-weight: 400;
            text-align: center;
            white-space: nowrap;
            vertical-align: middle;
            height: 35px;
            width: 150px;
        }

        .ModalTitle {
            font-size: 20px;
            letter-spacing: 3px;
            color: #0b318f;
            font-weight: bold;
            font-family: "Yu Go";
            text-align: center;
        }

        .ModalText {
            font-size: 14px;
            letter-spacing: 3px;
            color: #000000;
            font-weight: normal;
            font-family: "Yu Go";
            text-align: center;
        }

        .mt-0 {
            margin-top: 8px !important;
        }

        .search_result {
            margin-left: 0px !important;
            font-weight: bold;
        }


        .table>tbody>tr>td,
        .table>tfoot>tr>td,
        .table>thead>tr>td {
            padding: 2px;
            line-height: 1.42857143;
            vertical-align: middle;
            border-bottom: 1px solid #ddd;
        }

        .table>tbody>tr>th,
        .table>tfoot>tr>th,
        .table>thead>tr>th {
            padding: 5px;
            line-height: 1.42857143;
            vertical-align: middle;
            border-bottom: 1px solid #ddd;
        }
        input::-webkit-outer-spin-button,
        input::-webkit-inner-spin-button {
            -webkit-appearance: none;
            margin: 0;
        }
        input[type=number] {
            -moz-appearance: textfield;
        }
    </style>
    <script>
        var regex = /^[0-9]+$/;
        var flag = true;
        function focusInput(e){
            e.onblur  = function(){
                valid(e);
            }
            e.oninput  = function(){
                valid(e);
            }
        }
        function focusInput1(e){
            e.onblur  = function(){
                ValidNumber(e);
            }
            e.oninput  = function(){
                ValidNumber(e);
            }
        }
        function focusInput2(e){
            var b = document.getElementById("maxlength");
            e.onblur  = function(){
                if(e.value=="" ){
                    e.classList.add("is-invalid");
                    b.innerText = "Vui lòng nhập trường này";
                    flag = false;
                }else if(e.value!="" && e.value.length > 20){
                    e.classList.add("is-invalid");
                    b.innerText = "Vui lòng nhập dưới 20 ký tự";
                    flag = false;
                }else {
                    e.classList.remove("is-invalid");
                    flag = true;
                }
            }
            e.oninput  = function(){
                if(e.value=="" ){
                    e.classList.add("is-invalid");
                    b.innerText = "Vui lòng nhập trường này";
                    flag = false;
                }else if(e.value!="" && e.value.length > 20){
                    e.classList.add("is-invalid");
                    b.innerText = "Vui lòng nhập dưới 20 ký tự";
                    flag = false;
                }else {
                    e.classList.remove("is-invalid");
                    flag = true;
                }
            }
        }
        function valid(a){
            if(a.value == ""){
                a.classList.add("is-invalid");
                flag = false;
            }else {
                a.classList.remove("is-invalid");
                flag = true;
            }
        }
        function ValidNumber(a){
            console.log(a.value.match(regex))
            if(a.value != a.value.match(regex) && a.value.length > 0){
                a.classList.add("is-invalid");
                flag = false;
            }else {
                a.classList.remove("is-invalid");
                flag = true;
            }
        }

    </script>
</head>
<body>
<!-- HEADER -->
<div id="header"></div>
<div class="container page-body-style">
    <div class="DetailTitlePage">
        <h3 class="panel-title">商品情報詳細</h3>
    </div>
    <form name = "formupdate" id="formupdate">
        <div class="container form-group" >
            <div class="card" >
                <div class="card-body">
                    <div class="alert alert-danger mt-0 alert-dismissible" role="alert">
                        エラーメッセージ1
                        <button type="button" class="close" data-dismiss="alert" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="row mt-0">
                        <div class="col-3 bg-light align-bottom">
                            <span class="align-middle"><label for="janCode"  class="text-label">JANコード <span class="required_field">*</span></label></span>
                        </div>
                        <div class="col-5">
                            <input type="text" class="form-control form-control-sm" onfocus="focusInput1(this)"  name="janCode" id="janCode" aria-describedby="JANコード">
                            <div class="invalid-feedback">feedback text</div>
                        </div>
                        <div class="col-4">
                            <label for="janCode"  class="text-label">半角英数字のみ</label>
                        </div>
                    </div>
                    <div class="row mt-0">
                        <div class="col-3 bg-light align-bottom">
                            <span class="align-middle"><label for="productCode"  class="text-label">商品コード <span class="required_field">*</span></label></span>
                        </div>
                        <div class="col-5">
                            <input type="text" class="form-control form-control-sm" onfocus="focusInput2(this)" id="productCode" name="productCode" aria-describedby="商品コード">
                            <div class="invalid-feedback " id="maxlength">123</div>
                        </div>
                        <div class="col-4">
                            <label for="productCode"  class="text-label">半角英数字記号のみ（20文字まで）</label>
                        </div>
                    </div>
                    <div class="row mt-0">
                        <div class="col-3 bg-light align-bottom">
                            <span class="align-middle"><label for="storeDisplayFlg" class="text-label">ストア表示フラグ</label></span>
                        </div>
                        <div class="col-5">
                            <div class="form-check form-check-inline">
                                <input class="form-check-input form-control-sm" type="checkbox" id="storeDisplayFlg" value="1">
                                <label class="form-check-label" for="storeDisplayFlg">表示する</label>
                            </div>
                        </div>
                        <div class="col-4">
                        </div>
                    </div>

                    <div class="row mt-0">
                        <div class="col-3 bg-light align-bottom">
                            <span class="align-middle"><label for="productExplain" class="text-label">商品説明</label></span>
                        </div>
                        <div class="col-5">
                            <textarea class="form-control  form-control-sm" id="productExplain" rows="2"></textarea>
                        </div>
                        <div class="col-4">
                            <label for="productExplain"  class="text-label"></label>
                        </div>
                    </div>

                    <div class="row mt-0">
                        <div class="col-3 bg-light align-bottom">
                            <span class="align-middle"><label for="precautions" class="text-label">注意事項</label></span>
                        </div>
                        <div class="col-5">
                            <textarea class="form-control  form-control-sm" id="precautions" rows="2"></textarea>
                        </div>
                        <div class="col-4">
                            <label for="precautions"  class="text-label"></label>
                        </div>
                    </div>

                    <div class="row mt-0">
                        <div class="col-3 bg-light align-bottom">
                            <span class="align-middle"><label for="remark" class="text-label">備考</label></span>
                        </div>
                        <div class="col-5">
                            <textarea class="form-control  form-control-sm" id="remark" rows="2"></textarea>
                        </div>
                        <div class="col-4">
                            <label for="remark"  class="text-label"></label>
                        </div>
                    </div>

                    <div class="row mt-0">
                        <div class="col-3 bg-light align-bottom">
                            <span class="align-middle"><label for="productImage" class="text-label">商品画像</label></span>
                        </div>
                        <div class="col-5">
                            画像.png
                        </div>
                        <div class="col-4">
                            <div class="card" >
                                <div class="card-header">
                                    <label class="btn btn-default">
                                        アップロード <input type="file" hidden>
                                    </label>
                                </div>
                                <div class="card-body">
                                    ※ 推奨サイズ：H300px × W300px</br>
                                    ※ 上限サイズ：200kbまで

                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="row mt-0">
                        <div class="col text-center">
                            <button type="button" class="clear-button btn btn-outline-info common-left-button" data-toggle="modal"  data-target="#returnConfirmModal">戻る</button>
                            <button type="button" class="btn btn-info common-left-button" data-toggle="modal"  data-target="#updateConfirmModal">更新</button>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </form>
    <!-- /.container -->
</body>
<div id="footer"></div>

<!-- Modal -->
<div class="modal fade" id="updateConfirmModal" tabindex="-1" role="dialog" aria-labelledby="Update Confirm" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-body ModalText">
                商品の更新を行います</br>よろしいですか？
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">はい</button>
                <button type="button" class="btn btn-secondary" data-dismiss="modal">いいえ</button>
            </div>
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="uploadFailModal" tabindex="-1" role="dialog" aria-labelledby="Update fail" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title ModeaTitle" id="uploadFailModal">ファイルのアップロードに失敗しました</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body ModalText">
                ファイルの形式、サイズなどを確認してください。
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">OK</button>
            </div>
        </div>
    </div>
</div>

<!-- Modal -->
<div class="modal fade" id="returnConfirmModal" tabindex="-1" role="dialog" aria-labelledby="returnConfirmModalTitle" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title ModeaTitle" id="returnConfirmModalTitle">このページから移動しますか？</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body ModalText">
                編集中の内容は破棄されます。</br>よろしいですか？
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-primary">はい</button>
                <button type="button" class="btn btn-secondary" data-dismiss="modal">いいえ</button>
            </div>
        </div>
    </div>
</div>

</html>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.slim.min.js"><\/script>')</script><script src="../../assets/dist/js/bootstrap.bundle.min.js"></script>

