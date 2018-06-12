import React from 'react'
import ContactPage from "./ContactPage";

class Container extends React.Component {
  constructor(props) {
    super(props);
  }

  render() {
    return (
        <div style={containerStyle}>
          <ContactPage
              groupName={this.props.groupName}
              _setCheckContactsAndsetActivateFunction={(func, contacts) => {
                this.props._setCheckContactsAndsetActivateFunction(func,
                    contacts)
              }}
          />
        </div>
    )
  }
}

const containerStyle = {
  position: 'absolute',
  left: '251px',
  right: '0',
  top: '50px',
  bottom: '0',
  border: '1px solid black',
  display: 'block',
  width: 'auto',
  height: '100%',
}

export default Container;