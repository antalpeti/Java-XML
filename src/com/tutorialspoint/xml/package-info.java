/**
 * Description about the XML and XML parsing.
 *
 * <h2>What is XML?</h2>
 * <p>
 * XML is a simple text based language which was designed to store and transport data in plain text
 * format. It stands for Extensible Markup Language. Following are some of the salient features of
 * XML.
 * </p>
 * <ul>
 * <li>
 * <p>
 * XML is a markup language.
 * </p>
 * </li>
 * <li>
 * <p>
 * XML is a tag based language like HTML.
 * </p>
 * </li>
 * <li>
 * <p>
 * XML tags are not predefined like HTML.
 * </p>
 * </li>
 * <li>
 * <p>
 * You can define your own tags which is why it is called extensible language.
 * </p>
 * </li>
 * <li>
 * <p>
 * XML tags are designed to be self descriptive.
 * </p>
 * </li>
 * <li>
 * <p>
 * XML is W3C Recommendation for data storage and transport.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>Advantages</h2>
 * <p>
 * Following are the advantages that XML provides:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Technology agnostic</b> - Being plain text, XML is technology independent. It can be used by
 * any technology for data storage and transmission purpose.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Human readable</b>- XML uses simple text format. It is human readable and understandable.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Extensible</b> - in XML, custom tags can be created and used very easily.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Allow Validation</b> - Using XSD, DTD and XML structure can be validated easily.
 * </p>
 * </li>
 * </ul>
 * <h2>Disadvantages</h2>
 * <p>
 * Following are the disadvantages of XML usage:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Redundant Syntax</b> - Normally XML file contains lot of repeatitive terms.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>Verbose</b>-Being a verbose language, XML file size increases the transmission and storage
 * costs.
 * </p>
 * </li>
 * </ul>
 *
 * <h2>What is XML Parsing?</h2>
 * <p>
 * Parsing XML refers to going through XML document to access data or to modify data in one or other
 * way.
 * </p>
 * <h2>What is XML Parser?</h2>
 * <p>
 * XML Parser provides way how to access or modify data present in an XML document. Java provides
 * multiple options to parse XML document. Following are various types of parsers which are commonly
 * used to parse XML documents.
 * </p>
 * <ul>
 * <li>
 * <p>
 * <b>Dom Parser</b> - Parses the document by loading the complete contents of the document and
 * creating its complete hiearchical tree in memory.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>SAX Parser</b> - Parses the document on event based triggers. Does not load the complete
 * document into the memory.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>JDOM Parser</b> - Parses the document in similar fashion to DOM parser but in more easier way.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>StAX Parser</b> - Parses the document in similar fashion to SAX parser but in more efficient
 * way.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>XPath Parser</b> - Parses the XML based on expression and is used extensively in conjuction
 * with XSLT.
 * </p>
 * </li>
 * <li>
 * <p>
 * <b>DOM4J Parser</b> - A java library to parse XML, XPath and XSLT using Java Collections
 * Framework , provides support for DOM, SAX and JAXP.
 * </p>
 * </li>
 * </ul>
 * <p>
 * There are JAXB and XSLT APIs available to handle XML parsing in Object Oriented way.We'll
 * elboborate each parser in detail in next chapters.
 * </p>
 */
package com.tutorialspoint.xml;