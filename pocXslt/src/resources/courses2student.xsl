<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" 
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method ="xml" indent="yes"/>
	
	  <xsl:template match="/">
		<students>
			<xsl:apply-templates/>
		</students>
	</xsl:template> 
	
	<xsl:template match="courses/course/students/student">
	<student>
		<xsl:attribute name="id"><xsl:value-of select="@id"/></xsl:attribute>
		<name>
			<xsl:value-of select="name"/>
		</name>
	</student> 
	</xsl:template> 
	
	
</xsl:stylesheet>