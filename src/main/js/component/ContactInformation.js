import React from 'react'

class ContactInformation extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      phoneNumberCount: 1,
      emailCount: 1,
      groupCount: 1,
      hashtagCount: 1,
    }
  }

  _getPageName() {
    const {activateFunction} = this.props;
    if (activateFunction === 'InsertContact') {
      return "연락처 추가"
    }
    if (activateFunction === 'ModifyContact') {
      return "연락처 수정"
    }
    if (activateFunction === 'DetailContact') {
      return "연락처 삭제"
    }
  }

  render() {
    return (
        <form style={formStyle}>
          <span>{this._getPageName()}</span> <br/>
          <label>이름 <input type="text" placeholder="이름"/></label> <br/>
          <label>전화번호 <input type="tel" placeholder="전화번호"/></label> <br/>
          <label>이메일 <input type="email" placeholder="이메일"/></label> <br/>
          <label>그룹 <input type="text" placeholder="그룹"/></label> <br/>
          <label>소속정보
            <input type="text" placeholder="부서"/>
            <input type="text" placeholder="직책"/>
            <input type="text" placeholder="주소"/>
          </label> <br/>
          <label>해시태그 <input type="text" placeholder="해시태그"/></label> <br/>
          <input type="submit" value="저장" onClick={this.handleSubmit}/>
          <input type="button" value="취소" onClick={() => {
            this.props._closePopupWindow()
          }}/>
        </form>
    )
  }
}

var formStyle = {
  position: 'absolute',
  top: '25%',
  left: '25%',
  backgroundColor: 'white',
  border: '1px solid black',
}

export default ContactInformation;