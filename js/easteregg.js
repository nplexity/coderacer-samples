/*easteregg.js*/
/*JavaScript*/
/*https://github.com/google/WebFundamentals/blob/master/src/site/js/easteregg.js*/

function toggleClass(elem, className) {
  'use strict';
  var newClass = ' ' + elem.className.replace(/[\t\r\n]/g, ' ') + ' ';
  if (hasClass(elem, className)) {
    while (newClass.indexOf(' ' + className + ' ') >= 0) {
      newClass = newClass.replace( ' ' + className + ' ' , ' ');
    }
    elem.className = newClass.replace(/^\s+|\s+$/g, '');
  } else {
    elem.className += ' ' + className;
  }
}
