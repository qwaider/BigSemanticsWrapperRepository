//
// DleseGetRecord.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2014 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.Generated.Library.DleseNS;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.DleseNS 
{
	[SimplInherit]
	[SimplTag("DDSWebService")]
	public class DleseGetRecord : CompoundDocument
	{
		[SimplCollection("record")]
		[SimplTag("GetRecord")]
		[MmName("records")]
		private List<DleseRecord2> records;

		public DleseGetRecord()
		{ }

		public DleseGetRecord(MetaMetadataCompositeField mmd) : base(mmd) { }


		public List<DleseRecord2> Records
		{
			get{return records;}
			set
			{
				if (this.records != value)
				{
					this.records = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
