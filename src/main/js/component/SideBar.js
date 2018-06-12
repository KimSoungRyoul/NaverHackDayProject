import React from 'react'

const testGroups = [{
  group_id: 123,
  group_name: '새 그룹',
}, {
  group_id: 456,
  group_name: '새 그룹(1)',
}]

class SideBar extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      groups: '',
    }
  }

  render() {
    var groups = testGroups.map(group =>
        <div key={group.group_id}>
          <a href="#">{group.group_name}</a>
          <input type="button" value="그룹 수정" onClick={() => {
            this.props._setActivateFunction('ModifyGroup');
          }}/>
          <input type="button" value="그룹 삭제"/>
        </div>
    );

    return (
        <div style={outsideDivStyle}>
          <div style={sidebarStyle}>
            <div style={defaultDivStyle}>
              <input type="button" value="연락처 추가" onClick={() => {
                this.props._setActivateFunction('InsertContact');
              }}/>
              <input type="button" value="그룹 추가"/> <br/>
              <input type="button" value="자주 사용하는 연락처"/>
            </div>
            <div style={groupDivStyle}>
              <a href="#">전체 연락처</a> <br/>
              {groups}
            </div>
            <div style={defaultDivStyle}>
              <a href="#">중복연락처 찾기</a> <br/>
              <a href="#">유사연락처 찾기</a>
            </div>
            <div style={lastDivStyle}>
              Empty
            </div>
          </div>
        </div>
    )
  }
}

const outsideDivStyle = {
  position: 'absolute',
  left: '0',
  top: '50px',
  bottom: '0',
  display: 'block',
}

const sidebarStyle = {
  width: '250px',
  border: '1px solid black',
}

const defaultDivStyle = {
  border: '1px solid black',
  height: '150px',
}

const groupDivStyle = {
  border: '1px solid black',
  minHeight: '150px',
}

const lastDivStyle = {
  border: '1px solid black',
}

export default SideBar;