import React from 'react'

class Popup extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
        <div style={divStyle}>
          <h2>{this.props.activateFunction}</h2> <br/>
          <h3>{this.props.activateFunction}</h3> <br/>
          <input type="text"/> <br/>
          <input type="button" value="저장"/>
          <input type="button" value="취소"/>
        </div>
    )
  }
}

const divStyle = {
  position: 'absolute',
  top: '50%',
  left: '50%',
  backgroundColor: 'white',
  border: '1px solid black',
}

export default Popup;