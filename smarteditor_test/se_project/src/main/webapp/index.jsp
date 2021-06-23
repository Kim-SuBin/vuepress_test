<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Smart Editor Test</title>
<link href="css/admin.css" rel="stylesheet" />
<link href="css/main.css" rel="stylesheet" />
<script type="text/javascript" src="se2/js/HuskyEZCreator.js" charset="utf-8"></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-1.9.0.min.js"></script>
</head>

<script type="text/javascript">
    var oEditors = [];
    $(document).ready(function(){
    	
    	nhn.husky.EZCreator.createInIFrame({
            oAppRef : oEditors,
            elPlaceHolder : "se2Body", //textarea에서 지정한 id와 일치.
            sSkinURI : "se2/SmartEditor2Skin.html",
            htParams : {
                // 툴바 사용 여부 
                bUseToolbar : true,
                // 입력창 크기 조절바 사용 여부 
                bUseVerticalResizer : true,
                // 모드 탭(Editor | HTML | TEXT) 사용 여부 
                bUseModeChanger : true,
                bSkipXssFilter : true,
                fOnBeforeUnload : function(){
                    
                }
            },

            fCreator : "createSEditor2"
        });
    	
    	$("#se2SaveBtn").click(function(){
        	oEditors.getById["se2Body"].exec("UPDATE_CONTENTS_FIELD", []);
        	$("#Frm").submit();
        });
    	
    });
    
    
    
    
</script>

<body>
	<div class="notice">
		<p class="title">공지사항</p>
		<div class="board">
			<form name="Frm" method="post" action="sendCheck.jsp" id="Frm">
				<table width="100%" border="0" cellspacing="0" cellpadding="0" class="mt20">
					<colgroup>
						<col width="20%">
						<col width="80%">
					</colgroup>
					<tbody>
						<tr>
							<th class="left">제목</th>
							<td>
								<input type="text" id="head" name="head" class="title">
							</td>
						</tr>
						<tr>
							<th class="left">첨부파일</th>
							<td>
								<p class="point">
									※ 사진이미지 파일명이 한글인 경우 컴퓨터에 따라서 사진을 보지 못하는 경우가<br />&nbsp;&nbsp;&nbsp;&nbsp; 발생하므로 이미지 파일명은 되도록 영문으로 변경하여 올려 주시기 바랍니다.
								</p>
								<div class="fileInput mt10">
									<strong>첨부1</strong> &nbsp;
									<input type="text" class="file" value="선택된 파일 없음" id="file_txt1" name="file_txt1" readonly="readonly">
									<label class="btnSelect">파일 선택<input type="file" id="file1" name="file" onchange="document.getElementById('file_txt1').value=this.value"></label>
								</div>
								<div class="fileInput mt10">
									<strong>첨부2</strong> &nbsp;
									<input type="text" class="file" value="선택된 파일 없음" id="file_txt2" name="file_txt2" readonly="readonly">
									<label class="btnSelect">파일 선택<input type="file" id="file2" name="file" onchange="document.getElementById('file_txt2').value=this.value"></label>
								</div>
								<div class="fileInput mt10">
									<strong>첨부3</strong> &nbsp;
									<input type="text" class="file" value="선택된 파일 없음" id="file_txt3" name="file_txt3" readonly="readonly">
									<label class="btnSelect">파일 선택<input type="file" id="file3" name="file" onchange="document.getElementById('file_txt3').value=this.value"></label>
								</div>
								<div class="fileInput mt10">
									<strong>첨부4</strong> &nbsp;
									<input type="text" class="file" value="선택된 파일 없음" id="file_txt4" name="file_txt4" readonly="readonly">
									<label class="btnSelect">파일 선택<input type="file" id="file4" name="file" onchange="document.getElementById('file_txt4').value=this.value"></label>
								</div>
								<div class="fileInput mt10">
									<strong>첨부5</strong> &nbsp;
									<input type="text" class="file" value="선택된 파일 없음" id="file_txt5" name="file_txt5" readonly="readonly">
									<label class="btnSelect">파일 선택<input type="file" id="file5" name="file" onchange="document.getElementById('file_txt5').value=this.value"></label>
								</div>
							</td>
						</tr>
						<tr>
							<th class="left">내용</th>
							<td>
								<textarea id="se2Body" name="se2Body" class="createSEditor2" style="width:90%"></textarea>
							</td>
						</tr>
					</tbody>
				</table>
				<ul class="btnList">
					<li>
						<input type="button" class="solidBtn" id="se2SaveBtn" value="저장"/>
					</li>
					<li>
						<a href="javascript:fn_list();" class="lineBtn">취소</a>
					</li>
				</ul>
			</form>
		</div>
	</div>
</body>

</html>


