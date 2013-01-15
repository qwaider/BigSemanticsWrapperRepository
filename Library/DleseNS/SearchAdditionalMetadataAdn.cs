//
// SearchAdditionalMetadataAdn.cs
// s.im.pl serialization
//
// Generated by MetaMetadataDotNetTranslator.
// Copyright 2013 Interface Ecology Lab. 
//


using Ecologylab.Collections;
using Ecologylab.Semantics.MetaMetadataNS;
using Ecologylab.Semantics.MetadataNS;
using Ecologylab.Semantics.MetadataNS.Builtins;
using Ecologylab.Semantics.MetadataNS.Scalar;
using Simpl.Fundamental.Generic;
using Simpl.Serialization;
using Simpl.Serialization.Attributes;
using System;
using System.Collections;
using System.Collections.Generic;

namespace Ecologylab.Semantics.Generated.Library.DleseNS 
{
	[SimplInherit]
	public class SearchAdditionalMetadataAdn : Metadata
	{
		[SimplScalar]
		[SimplTag("partOfDrc")]
		private MetadataString partOfDrc;

		[SimplScalar]
		[SimplTag("accessionStatus")]
		private MetadataString accessionStatus;

		public SearchAdditionalMetadataAdn()
		{ }

		public SearchAdditionalMetadataAdn(MetaMetadataCompositeField mmd) : base(mmd) { }


		public MetadataString PartOfDrc
		{
			get{return partOfDrc;}
			set
			{
				if (this.partOfDrc != value)
				{
					this.partOfDrc = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}

		public MetadataString AccessionStatus
		{
			get{return accessionStatus;}
			set
			{
				if (this.accessionStatus != value)
				{
					this.accessionStatus = value;
					// TODO we need to implement our property change notification mechanism.
				}
			}
		}
	}
}
